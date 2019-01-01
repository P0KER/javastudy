package com.unionpay.designPattern.Singleton.lazy;

/**
 * created by poker on 2019/1/1
 */
public class SingletonWithVolatile {
    private SingletonWithVolatile(){
        System.out.println("[constructor]" + Thread.currentThread().getName());
    }
    private static volatile SingletonWithVolatile instance;
    public static SingletonWithVolatile getInstance(){
        if(instance == null){
            synchronized (SingletonWithVolatile.class){
                if(instance == null){
                    instance = new SingletonWithVolatile();
                }
            }
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
