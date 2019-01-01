package com.unionpay.designPattern.Singleton.lazy;

/**
 * created by poker on 2019/1/1
 */
public class Singleton {
    private Singleton(){
        System.out.println("[constructor] " + Thread.currentThread().getName());
    }
    private static Singleton instance;
    public static synchronized Singleton getInstance(){//使用synchronized具有高并发情况下的性能问题
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        new Thread(()->Singleton.getInstance(),"threadA").start();
        new Thread(()->Singleton.getInstance(),"threadB").start();
        new Thread(()->Singleton.getInstance(),"threadC").start();
        new Thread(()->Singleton.getInstance(),"threadD").start();
        new Thread(()->Singleton.getInstance(),"threadE").start();
    }
}
