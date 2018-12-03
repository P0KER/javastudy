package com.unionpay.designPattern.observer;

/**
 * Created by puke on 2018/11/28
 */
public class Main {
    public static void main(String[] args) {
        Person perA = new Person();
        Person perB = new Person();
        Person perC = new Person();
        House house = new House(80000.00);
        house.addObserver(perA);
        house.addObserver(perB);
        house.addObserver(perC);
        house.setPrice(90000.00);
    }
}
