package com.unionpay.net.socket.ultimate;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * created by poker on 2019/1/5
 */
public class ThreadServer implements Runnable {
    private Socket client;
    private BufferedReader br;
    private PrintWriter pw;

    public ThreadServer(Socket client) {
        this.client = client;
    }

    @Override
    public void run() {
        try{
            br = new BufferedReader(new InputStreamReader(client.getInputStream()));
            pw = new PrintWriter(client.getOutputStream(), true);
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
        } catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                pw.close();
                br.close();
            }catch(Exception e){}
        }
    }
}
