package com.unionpay.threadlocal;

/**
 * Created by puke on 2018/11/28
 */
public class MessageConsumer {
    public void print(){
        System.out.println(Thread.currentThread().getName() + "=" + MyUtil.get().getNote());
    }
}
