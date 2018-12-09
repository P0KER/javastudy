package com.unionpay.designPattern.factory;

/**
 * created by poker on 2018/12/8
 */
public class IMessageImpl implements IMessage{
    @Override
    public void print() {
        System.out.println("this is msg!");
    }
}
