package com.unionpay.designPattern.proxy;

/**
 * created by poker on 2019/1/1
 */
public class Main {
    public static void main(String[] args) {
        ISubject subject = Factory.getInstance();
        subject.save();
    }
}
