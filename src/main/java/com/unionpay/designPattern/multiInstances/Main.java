package com.unionpay.designPattern.multiInstances;

/**
 * Created by puke on 2018/10/30
 */
public class Main {
    public static void main(String[] args) {
        switch (Color2.RED){
            case RED:
                System.out.println("red");
                break;
            case BLUE:
                System.out.println("blue");
                break;
            default:
                System.out.println("green");
        }
    }
}
