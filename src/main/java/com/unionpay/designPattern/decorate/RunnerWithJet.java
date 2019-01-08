package com.unionpay.designPattern.decorate;

/**
 * Created by puke on 2019/1/7
 * 装饰者模式（加强被修饰对象的功能）
 */
public class RunnerWithJet implements IRunner {
    private IRunner runner;

    public RunnerWithJet(IRunner runner) {
        this.runner = runner;
    }

    @Override
    public void run() {
        System.out.println("给运动员屁股后面加一个推进装置");
        runner.run();
    }
}
