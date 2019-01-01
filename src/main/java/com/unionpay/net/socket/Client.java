package com.unionpay.net.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * created by poker on 2019/1/1
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("127.0.0.1", 9999);
        Scanner scanner = new Scanner(System.in);
        BufferedReader input = new BufferedReader(new InputStreamReader(client.getInputStream()));
        PrintWriter output = new PrintWriter(client.getOutputStream(), true);
        while(true){
            System.out.println("please enter a message:");
            String msgToSnd = scanner.nextLine().trim();
            System.out.println("[client] send: " + msgToSnd);
            output.println(msgToSnd);
            String msgRcv = input.readLine().trim();
            if("bye".equalsIgnoreCase(msgToSnd)){
                break;
            }
        }
        output.close();
        input.close();
        scanner.close();
        client.close();
    }
}
