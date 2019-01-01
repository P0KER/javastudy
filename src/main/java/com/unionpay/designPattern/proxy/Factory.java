package com.unionpay.designPattern.proxy;

/**
 * created by poker on 2019/1/1
 */
public class Factory {

    public static ISubject getInstance(){
        return new ProxySubject(new RealSubject());
    }
}
