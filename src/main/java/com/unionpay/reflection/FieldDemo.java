package com.unionpay.reflection;

import java.lang.reflect.Field;

/**
 * created by poker on 2018/12/8
 */
public class FieldDemo {

    public static void main(String[] args) {
        try {
            Class<?> cls = Class.forName("com.unionpay.reflection.Person");
            Object obj = cls.newInstance();
            Field field = cls.getDeclaredField("name");
            field.setAccessible(true);
            field.set(obj, "poker");
            System.out.println(field.get(obj));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
