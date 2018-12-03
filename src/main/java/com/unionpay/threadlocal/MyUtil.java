package com.unionpay.threadlocal;

/**
 * Created by puke on 2018/11/28
 */
public class MyUtil {
    private static ThreadLocal<Message> threadLocal = new ThreadLocal<>();
    public static void set(Message msg){
        threadLocal.set(msg);
    }
    public static Message get(){
        return threadLocal.get();
    }
}
