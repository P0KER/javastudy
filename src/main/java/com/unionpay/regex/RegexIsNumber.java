package com.unionpay.regex;

/**
 * Created by puke on 2018/11/28
 */
public class RegexIsNumber {
    public static void main(String[] args) {
        System.out.println("abc".matches("\\d+"));
        System.out.println("123".matches("\\d+"));
        System.out.println("\\".matches("\\\\"));
    }
}
