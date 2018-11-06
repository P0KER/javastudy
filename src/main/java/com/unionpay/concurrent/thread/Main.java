package com.unionpay.concurrent.thread;

/**
 * Created by puke on 2018/11/1
 */
public class Main {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        new Thread(mt).start();
        new Thread(mt).start();
        new Thread(mt).start();
    }
}
