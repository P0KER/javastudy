package com.unionpay.cloneable;

/**
 * Created by puke on 2018/11/5
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person perA = new Person("A", 25);
        Person perB = (Person)perA.clone();
        perB.setAge(22);
        perB.setName("B");
        System.out.println(perA);
        System.out.println(perB);
    }
}
