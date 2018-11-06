package com.unionpay.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * created by poker on 2018/7/18
 */
public class DeSerialTest {

    public static void main(String[] args) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("com.unionpay.serialization.Person.txt"));
        Person person = (Person)ois.readObject();
        ois.close();
        System.out.println("com.unionpay.serialization.Person serial:" + person);
    }
}
