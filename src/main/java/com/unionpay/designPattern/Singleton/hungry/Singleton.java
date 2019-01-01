package com.unionpay.designPattern.Singleton.hungry;

/**
 * created by poker on 2019/1/1
 */
public class Singleton {

    private Singleton(){}

    private static final Singleton INSTANCE = new Singleton();

    public static Singleton getInstance(){
        return INSTANCE;
    }
}
