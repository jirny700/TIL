package me.yejin.chatting;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.lang.System.out;

public class ChatServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        //공유객체에서 쓰레드에 안전한 리스트를 만든다.
        List<PrintWriter> outList = Collections.synchronizedList(new ArrayList<>());
        while (true) {
            Socket socket = serverSocket.accept();

            ChatThread chatThread = new ChatThread(socket, outList);
            chatThread.start();
        }
    }
}
