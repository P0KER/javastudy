package com.unionpay.threadlocal;

/**
 * Created by puke on 2018/11/28
 */
public class Main {
    public static void main(String[] args) {
        new Thread(()->{
            Message msg = new Message();
            msg.setNote("aaa");
            MyUtil.set(msg);
            new MessageConsumer().print();
        }, "thread-A").start();
        new Thread(()->{
            Message msg = new Message();
            msg.setNote("bbb");
            MyUtil.set(msg);
            new MessageConsumer().print();
        }, "thread-B").start();

    }
}
