package com.unionpay.designPattern.factory;

/**
 * created by poker on 2018/12/8
 */
public class Factory {

    private Factory(){}

    public static IFruit getInstance(String className){
        IFruit fruit = null;
        try {
            fruit = (IFruit) Class.forName(className).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return fruit;
    }
}
