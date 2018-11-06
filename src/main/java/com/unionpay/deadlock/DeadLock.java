package com.unionpay.deadlock;

/**
 * created by poker on 2018/11/4
 */
public class DeadLock implements Runnable{
    private static Pen pen = new Pen();
    private static Note note = new Note();

    public static void main(String[] args) {
        new DeadLock();
    }

    public DeadLock() {
        new Thread(this).start();
        pen.get(note);
    }

    @Override
    public void run() {
        note.get(pen);
    }
}
