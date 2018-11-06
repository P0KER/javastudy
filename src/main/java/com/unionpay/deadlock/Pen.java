package com.unionpay.deadlock;

/**
 * created by poker on 2018/11/4
 */
public class Pen {

    public synchronized void get(Note note){
        System.out.println("为了拿纸");
        note.result();
    }
    public synchronized void result() {
        System.out.println("为了涂鸦");
    }
}
