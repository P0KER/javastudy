package com.unionpay.concurrent.callable;

import java.util.concurrent.FutureTask;

/**
 * Created by puke on 2018/11/1
 */
public class Main {
    public static void main(String[] args) throws Exception{
        FutureTask<String> task = new FutureTask<String>(new MyThread());
        new Thread(task).start();
        System.out.println(task.get());
    }
}
