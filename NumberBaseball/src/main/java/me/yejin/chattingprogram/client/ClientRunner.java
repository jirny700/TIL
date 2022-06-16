package me.yejin.chattingprogram.client;

import me.yejin.chattingprogram.client.ChatClient;

public class ClientRunner {
    public static void main(String[] args){
        ChatClient chatClient = new ChatClient("192.168.43.226", 11000);
        chatClient.start();
    }
}

