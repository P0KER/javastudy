package com.unionpay.reflection.util;

/**
 * created by poker on 2018/12/8
 */
public class StringUtils {
    private StringUtils(){}

    public static String initCap(String str){
        return str.substring(0,1).toUpperCase() + str.substring(1);
    }
}
