package com.unionpay.serialization;

import java.io.Serializable;

/**
 * created by poker on 2018/7/18
 */
public class Person implements Serializable {


    private static final long serialVersionUID = 3614934570628202202L;

    public Person(int id, String name){
        this.id = id;
        this.name = name;
    }

    private int id;

    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "com.unionpay.serialization.Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
