package me.yejin.chattingprogram;

public class ClientRunner {
    public static void main(String[] args){
        ChatClient chatClient = new ChatClient("192.168.43.226", 11000);
        chatClient.start();
    }
}

