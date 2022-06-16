package me.yejin.chattingprogram;

import java.io.*;
import java.net.Socket;


public class ChatClient extends Thread {
    private String ip;
    private int port;
    private String name;

    public ChatClient(String ip, int port) {
        this.ip = ip;
        this.port = port;
    }

    @Override
    public void run() {
        BufferedReader in = null;
        PrintWriter out = null;
        BufferedReader keyboard = null;
        Socket socket = null;

        try {
            socket = new Socket(ip, port);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
            keyboard = new BufferedReader(new InputStreamReader(System.in));
            String line = null;

            InputHandler inputHandler = new InputHandler(in); //서버에 다른 클라이언트들이 쓰는 내용을 입력해주는 객체
            inputHandler.start();

            while ((line = keyboard.readLine()) != null) { //무한루프
                out.println(line);
                out.flush();
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                out.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }
}

