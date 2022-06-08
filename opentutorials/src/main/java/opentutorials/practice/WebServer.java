package opentutorials.practice;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class WebServer {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(9090);
        System.out.println("Server start!!");
        while (true) {
            Socket socket = ss.accept();
            SocketThread st = new SocketThread(socket);
            st.start();
        }
    }
}
