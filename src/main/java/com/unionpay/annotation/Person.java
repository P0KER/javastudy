package com.unionpay.annotation;

/**
 * Created by puke on 2018/10/30
 */
public class Person {
    @Deprecated
    public Person(){}
    public Person(String p){}
    @Deprecated
    public void fun(){}

    public static void main(String[] args) {
        Person person = new Person("ddd");
        person.fun();
    }
}
