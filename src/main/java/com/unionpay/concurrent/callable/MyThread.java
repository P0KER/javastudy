package com.unionpay.concurrent.callable;

import java.util.concurrent.Callable;

/**
 * Created by puke on 2018/11/1
 */
public class MyThread implements Callable<String> {
    @Override
    public String call() throws Exception {
        for(int i = 0; i < 20; i++){
            System.out.println("i = " + i);
        }
        return "sold out!";
    }
}
