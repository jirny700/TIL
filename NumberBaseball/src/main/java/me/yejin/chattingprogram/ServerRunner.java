package me.yejin.chattingprogram;


import java.net.InetAddress;
import java.net.UnknownHostException;

    public class ServerRunner {
        public static void main(String[] args) throws UnknownHostException {
            System.out.println(InetAddress.getLocalHost().getHostAddress());
            ChatServer chatServer = new ChatServer(11000);
            chatServer.start();
        }
    }

