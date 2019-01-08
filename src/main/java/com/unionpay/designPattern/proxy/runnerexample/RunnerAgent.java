package com.unionpay.designPattern.proxy.runnerexample;

import java.util.Random;

/**
 * Created by puke on 2019/1/7
 * 代理模式（对被代理的对象有控制权，决定其执行或者不执行，在if/else中有体现）
 */
public class RunnerAgent implements IRunner {
    private IRunner runner;

    public RunnerAgent(IRunner runner) {
        this.runner = runner;
    }

    @Override
    public void run() {
        Random random = new Random();
        if(random.nextBoolean()){
            System.out.println("代理人安排运动员跑步...");
            runner.run();
        }else{
            System.out.println("代理人有事情，不安排运动员跑步了...");
        }
    }
}
