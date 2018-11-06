package com.unionpay.random;

import java.util.Random;

/**
 * Created by puke on 2018/11/6
 */
public class RandomTest {
    public static void main(String[] args) {
        char[] data = new char[]{'a','b','c','d','e'};
        Random random = new Random();
        for(int i = 0; i < 3; i++){
            System.out.print(data[random.nextInt(data.length)]);
        }
    }
}
