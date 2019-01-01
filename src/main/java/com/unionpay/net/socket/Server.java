package com.unionpay.net.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * created by poker on 2019/1/1
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(9999);
        System.out.println("listening on port 9999");
        Socket client = server.accept();
        System.out.println("service accepted!");
        BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
        PrintWriter pw = new PrintWriter(client.getOutputStream(), true);
        while(true){
            String temp = br.readLine().trim();
            System.out.println("[server] rcv: " + temp);
            if("bye".equalsIgnoreCase(temp)){
                pw.println("see you!!!");
                break;
            }else{
                pw.println("ECHO: " + temp);
            }
        }
        pw.close();
        br.close();
        client.close();
        server.close();
    }
}
