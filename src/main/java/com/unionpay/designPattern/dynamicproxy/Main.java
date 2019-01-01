package com.unionpay.designPattern.dynamicproxy;

/**
 * created by poker on 2019/1/1
 */
public class Main {
    public static void main(String[] args) {
        ISubject subject = (ISubject) new ProxySubject().bind(new RealSubject());
        subject.eat("鱼香肉丝",20);
    }
}
