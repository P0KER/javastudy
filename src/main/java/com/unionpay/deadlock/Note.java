package com.unionpay.deadlock;

/**
 * created by poker on 2018/11/4
 */
public class Note {

    public synchronized void get(Pen pen){
        System.out.println("为了拿笔");
        pen.result();
    }

    public synchronized void result() {
        System.out.println("为了上厕所");
    }
}
