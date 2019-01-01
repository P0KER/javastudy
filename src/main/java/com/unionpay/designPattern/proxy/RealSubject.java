package com.unionpay.designPattern.proxy;

/**
 * created by poker on 2019/1/1
 */
public class RealSubject implements ISubject {
    @Override
    public void save() {
        System.out.println("英勇地制止了凶手！");
    }
}
