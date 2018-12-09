package com.unionpay.reflection;

import java.lang.reflect.Method;

/**
 * created by poker on 2018/12/8
 */
public class MethodInvoke {
    public static void main(String[] args) {
        try {
            Class<?> cls = Class.forName("com.unionpay.reflection.Person");
            Object obj = cls.newInstance();
            String attr = "name";
            String value = "poker";
            Method setMethod = cls.getMethod("set" + getInitCap(attr), String.class);
            setMethod.invoke(obj, value);
            Method getMethod = cls.getMethod("get" + getInitCap(attr));
            Object ret = getMethod.invoke(obj);
            System.out.println(ret);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static String getInitCap(String str){
        return str.substring(0,1).toUpperCase() + str.substring(1);
    }
}
