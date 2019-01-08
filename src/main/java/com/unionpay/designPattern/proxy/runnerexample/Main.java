package com.unionpay.designPattern.proxy.runnerexample;

/**
 * Created by puke on 2019/1/7
 */
public class Main {
    public static void main(String[] args) {
        IRunner runner = new Runner();
        IRunner agent = new RunnerAgent(runner);
        System.out.println("有人请求代理人让运动员跑步...");
        agent.run();
    }
}
