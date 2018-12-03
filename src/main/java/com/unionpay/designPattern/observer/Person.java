package com.unionpay.designPattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by puke on 2018/11/28
 * 观察者关注房价变化（房价上涨才关注）
 */
public class Person implements Observer{
    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof House){
            if(arg instanceof Double){
                System.out.println("房价上涨！新价格： " + arg);
            }
        }
    }
}
