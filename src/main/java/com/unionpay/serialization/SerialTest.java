package com.unionpay.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * created by poker on 2018/7/18
 */
public class SerialTest {

    public static void main(String[] args) throws Exception {
        Person person = new Person(1234, "wang");
        System.out.println("com.unionpay.serialization.Person serial:" + person);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("com.unionpay.serialization.Person.txt"));
        oos.writeObject(person);
        oos.close();
    }
}
