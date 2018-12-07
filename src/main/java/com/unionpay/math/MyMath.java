package com.unionpay.math;

import java.math.BigDecimal;

/**
 * Created by puke on 2018/11/6
 */
public class MyMath {
    private MyMath(){}
    public static double round(double num , int scale){
//        return Math.round(num * Math.pow(10, scale)) / Math.pow(10, scale);
        return new BigDecimal(num).divide(new BigDecimal(1), scale, BigDecimal.ROUND_HALF_UP).doubleValue();
    }



    public static void main(String[] args) {
//        System.out.println(MyMath.round(1234.4567, 2));
//        System.out.println(MyMath.round(1234.4567, 3));
//        System.out.println(MyMath.round(-1234.4567, 2));
//        System.out.println(MyMath.round(-1234.4567, 3));
        System.out.println(Math.round(416.7) / 100.0);
    }
}
