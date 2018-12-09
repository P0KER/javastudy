package com.unionpay.designPattern.factory;

/**
 * created by poker on 2018/12/8
 */
public class Main {
    public static void main(String[] args) {
        IFruit apple = Factory.getInstance("com.unionpay.designPattern.factory.Apple");
        apple.eat();
        IFruit orange = Factory.getInstance("com.unionpay.designPattern.factory.Orange");
        orange.eat();

        IMessage msg = PerfectFactory.getInstance("com.unionpay.designPattern.factory.IMessageImpl");
        msg.print();

        IFruit apple2 = PerfectFactory.getInstance("com.unionpay.designPattern.factory.Apple");
        apple2.eat();
    }
}
