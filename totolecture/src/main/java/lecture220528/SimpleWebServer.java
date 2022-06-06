package lecture220528;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class SimpleWebServer {
    public static void main(String[] args) throws Exception {
        //1.서버는 클라이언트를 기다린다.
        //2.클라이언트가 접속하면, 해당 클라이언트와 통신할 수 있는 Socket이 반환된다.
        //   -Socket이 반환되면 클라이언트와 통신하는 Thread를 만들어서 작업을 처리하게 된다.
        //3.1번부터 다시 시작한다.

        ServerSocket ss = new ServerSocket(9090);
        System.out.println("Server start!!");
        while(true){
            Socket socket = ss.accept();
            System.out.println("client :"+socket);
            SocketThread st = new SocketThread(socket);
            st.start();
        }
    }
}
class SocketThread extends Thread{
    Socket socket;
    public SocketThread(Socket socket){
        this.socket = socket;
    }
    //브라우저의 요청을 처리하는 메소드
    public void run(){
        System.out.println("socket을 이용해 클라이언트 동작한다.");
        try{
            OutputStream out = socket.getOutputStream();
            InputStream in = socket.getInputStream();
            PrintWriter pw = new PrintWriter((new OutputStreamWriter(out)));//한줄씩 socket쓰는 객체, 통로로 받은 데이터(소켓에서 나온 아웃풋 스트림)를 쓰기 편하게 데코레이트한다.
            BufferedReader br = new BufferedReader(new InputStreamReader(in));//한줄씩 socket에서 읽는 객체

            //브라우저의 요청을 읽어들여서 그 결과를 반환한다.
            //ex. http 프로토콜 요청이 인풋스트림을 통해 들어옴
            //  GET /servlet/query?a=10&b=90 HTTP/1.1
            //  Host: www.sk.com
            //  User-Agent: Mozilla/5.0
            //  Accept-language:kr
            Request request = processRequest(in,br);
            System.out.println(request.getFirstLine());
            System.out.println(request.getPath());

            //응답한다. path의 내용을 읽어들여서 클라이언트에게 전송한다.
            //ex. 응답
            //HTTP/1.1 200 OK
            //Connection: keep-alive
            //Content-Encoding: gzip
            //Content-Length: 35653
            //Content-Type: text/html;
            //빈줄
            //<!DOCTYPE html>
            //<html lang="ko" data-reactroot="">
            processReponse(request.getPath(),out,pw);
            socket.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    } //run

    class Request{
        String firstLine; //Get/
        List<String> headers;
        // 빈줄과 바디를 담을 수있는 필드가 필요함(http protocal request). todo

        public Request(){
            headers = new ArrayList<>(); //headers
        }

        public void setFirstLine(String firstLine) {
            this.firstLine = firstLine;
        }
        public void addHeader(String line){
            headers.add(line);
        }
        public String getFirstLine(){
            return firstLine;
        } // GET /servlet/query?a=10&b=90 HTTP/1.1

        public String getPath(){
            String[] strings = firstLine.split(" ");
            return strings[1];
        }

    }
    private Request processRequest(InputStream in, BufferedReader br) throws Exception{
        Request request = new Request();
        request.setFirstLine(br.readLine());
        String line = null;
        while(!(line = br.readLine()). equals("")){
            request.addHeader(line);
        }
        return request;
    }


    private void processReponse(String path,OutputStream out, PrintWriter pw) throws Exception{
        String baseDir = "/User/";
        String readFile = baseDir + path;
        //FileReader fr = new FileReader(ReadFile);
        //BufferedReader br = new BufferedReader(Fr);
        FileInputStream fis = new FileInputStream(readFile);

        //todo FileNotFoundException 핸들링 하기

        pw.println("HTTP/1.1 200 OK");
        pw.println("name : kim");
        pw.println("email : aaaa");
        pw.println();
        pw.flush();

        byte[] buffer = new byte[512];
        int readCount = -1;
        while((readCount = fis.read(buffer)) != -1){
            out.write(buffer,0,readCount);
        }

    }
}
