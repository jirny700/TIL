package opentutorials.practice;

import java.io.*;
import java.net.Socket;

public class SocketThread extends Thread {
    Socket socket;

    public SocketThread(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        System.out.println("socket을 이용해 클라이언트를 동작한다");
        try {
            OutputStream out = socket.getOutputStream();
            InputStream in = socket.getInputStream();
            PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            Request request = processRequest(br);
            System.out.println(request.getFirstLine());
            System.out.println(request.getPath());
            processResponse(request.getPath(), out, pw);
            socket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private Request processRequest(BufferedReader br) throws Exception {
        Request request = new Request();
        request.setFirstLine(br.readLine());
        String line = null;
        while (!(line = br.readLine()).equals("")) {
            request.addHeader(line);
        }
        return request;
    }

    private void processResponse(String path, OutputStream out, PrintWriter pw) throws Exception {
        pw.println("HTTP/1.1 200 OK");
        pw.println("name : kim");
        pw.println("email : aaaa");
        pw.flush();

        try {
            String baseDir = "/Users/";
            String readFile = baseDir + path;
            FileInputStream fis = new FileInputStream(readFile);

            byte[] buffer = new byte[512];
            int readCount = -1;
            while ((readCount = fis.read(buffer)) != -1) {
                out.write(buffer, 0, readCount);
            }
        } catch (FileNotFoundException ei) {
            System.out.println(ei.getStackTrace());
        }
    }
}