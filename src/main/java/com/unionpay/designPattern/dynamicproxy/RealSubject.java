package com.unionpay.designPattern.dynamicproxy;

/**
 * created by poker on 2019/1/1
 */
public class RealSubject implements ISubject {
    @Override
    public void eat(String msg, int num) {
        System.out.println("我要吃" + num + "分量的" + msg);
    }

}
