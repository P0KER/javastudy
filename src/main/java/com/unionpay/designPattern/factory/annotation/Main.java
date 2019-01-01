package com.unionpay.designPattern.factory.annotation;

import com.unionpay.designPattern.factory.IFruit;

/**
 * created by poker on 2019/1/1
 */
public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        IFruit fruit = AnnotationFactory.getInstance();
        fruit.eat();
    }
}
