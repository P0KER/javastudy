package com.unionpay.designPattern.proxy;

/**
 * created by poker on 2019/1/1
 */
public class ProxySubject implements ISubject {
    private ISubject subject;

    public ProxySubject(ISubject subject) {
        this.subject = subject;
    }

    @Override
    public void save() {
        breakIn();
        this.subject.save();
        praise();
    }

    public void breakIn(){
        System.out.println("1. 破门而入！");
    }

    public void praise(){
        System.out.println("2. 收到表扬！");
    }
}
