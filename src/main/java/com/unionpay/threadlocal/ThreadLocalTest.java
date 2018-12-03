package com.unionpay.threadlocal;

/**
 * Created by puke on 2018/11/28
 */
public class ThreadLocalTest {
    private static final ThreadLocal<Object> local = new ThreadLocal<Object>();

    public static void main(String[] args) {
        new Thread(()->{
            local.set("aaaaaa");
            System.out.println(Thread.currentThread().getName() + ": " + local.get());
        }, "thread-A").start();
        new Thread(()->{
            local.set("bbbbbb");
            System.out.println(Thread.currentThread().getName() + ": " + local.get());
        },"thread-B").start();

        System.out.println(Thread.currentThread().getName() + ": " + local.get());
    }
}
