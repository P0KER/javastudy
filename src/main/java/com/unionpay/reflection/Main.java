package com.unionpay.reflection;

import java.util.Date;

/**
 * Created by puke on 2018/12/7
 */
public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Date date = new Date();
        System.out.println(date.getClass());

        Class<?> cls1 = Date.class;

        Class<?> cls2 = Class.forName("java.util.Date");

        System.out.println(cls1.getName());
        System.out.println(cls2.getCanonicalName());
    }
}
