package com.unionpay.concurrent.thread.waitandNotify;

/**
 * created by poker on 2019/1/5
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Object a = new Object();
        Object b = new Object();
        Object c = new Object();
        ThreadPrinter tpa = new ThreadPrinter("A", c, a);
        ThreadPrinter tpb = new ThreadPrinter("B", a, b);
        ThreadPrinter tpc = new ThreadPrinter("C", b, c);
        new Thread(tpa).start();
        Thread.sleep(100);
        new Thread(tpb).start();
        Thread.sleep(100);
        new Thread(tpc).start();
        Thread.sleep(100);

    }
}
