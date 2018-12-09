package com.unionpay.designPattern.factory;

/**
 * created by poker on 2018/12/8
 */
public class PerfectFactory {

    private PerfectFactory(){}

    public static <T> T getInstance(String className){
        T obj = null;
        try {
            obj = (T) Class.forName(className).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }
}
