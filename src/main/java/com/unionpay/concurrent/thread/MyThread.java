package com.unionpay.concurrent.thread;

/**
 * Created by puke on 2018/11/1
 */
public class MyThread extends Thread {
    private int ticket = 10;

    @Override
    public void run() {
        for(int i = 0; i < 20; i ++){
            if(ticket > 0){
                System.out.println("ticket: " + ticket--);
            }
        }
    }
}
