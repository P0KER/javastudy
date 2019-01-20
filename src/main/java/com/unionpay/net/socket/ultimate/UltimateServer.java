package com.unionpay.net.socket.ultimate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * created by poker on 2019/1/1
 */
public class UltimateServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(9999);
        System.out.println("listening on port 9999");
        Socket client = null;
        while(true){
            client = server.accept();
            System.out.println("service accepted!");
            new Thread(new ThreadServer(client)).start();
        }
    }
}
