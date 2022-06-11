package opentutorials.webserverversion2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServerVersion2 {
    public static void main(String[] args) throws Exception {
        //클라이언트가 접속할 떄까지 대기할떄 필요한 객체생성->서버소켓
        ServerSocket serverSocket = new ServerSocket((9090));

        try {
            while (true) {
                Socket clientSocket = serverSocket.accept();
                ClientThread ct = new ClientThread(clientSocket);
                ct.start();
            }
        } finally {
            serverSocket.close();
        }
    }
}

class ClientThread extends Thread {
    private Socket clientSocket;

    public ClientThread(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    public void run() {
        try {
            InputStream inputStream = clientSocket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));

            OutputStream outputStream = clientSocket.getOutputStream();
            PrintWriter pw = new PrintWriter(new OutputStreamWriter(outputStream));

            String firstLine = br.readLine();
            String msg = "";
            if (firstLine.indexOf("/hello") >= 0)
                msg = "hello";
            else if (firstLine.indexOf("/hi" ) >= 0)
                msg = "hi";
            System.out.println(firstLine);

            String line = null;
            while (!(line = br.readLine()).equals("")) {
                System.out.println(line);
            }
            //빈줄까지 읽어들이면 끝

            pw.println("HTTP/1.1 200 OK");
            pw.println("name: kim");
            pw.println("email : aaaa");
            pw.println();
            pw.println("<html>");
            pw.println(msg + "world!");
            pw.println("<html>");

            pw.flush();
            br.close();
            pw.close();
            clientSocket.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
