package com.unionpay.designPattern.proxy.runnerexample;

/**
 * Created by puke on 2019/1/7
 */
public class Runner implements IRunner {
    @Override
    public void run() {
        System.out.println("运动员在跑步...");
    }
}
