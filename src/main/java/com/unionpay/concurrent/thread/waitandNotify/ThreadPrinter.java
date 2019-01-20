package com.unionpay.concurrent.thread.waitandNotify;

/**
 * created by poker on 2019/1/5
 */
public class ThreadPrinter implements Runnable {

    private String name;
    private Object prev;
    private Object self;

    public ThreadPrinter(String name, Object prev, Object self) {
        this.name = name;
        this.prev = prev;
        this.self = self;
    }

    @Override
    public void run() {
        int count = 10;
        while(count > 0){
            synchronized (prev){
                synchronized (self){
                    System.out.print(name);
                    count --;
                    self.notify();
                }
                try {
                    prev.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
