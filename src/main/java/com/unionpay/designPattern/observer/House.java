package com.unionpay.designPattern.observer;

import java.util.Observable;

/**
 * Created by puke on 2018/11/28
 */
public class House extends Observable{
    private double price;

    public House(double price) {
        this.price = price;
    }

    public void setPrice(double price) {
        if(price > this.price){
            super.setChanged();
            super.notifyObservers(price);
        }
        this.price = price;
    }
}
