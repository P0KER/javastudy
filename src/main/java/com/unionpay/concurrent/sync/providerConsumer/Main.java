package com.unionpay.concurrent.sync.providerConsumer;

/**
 * created by poker on 2018/11/4
 */
public class Main {
    public static void main(String[] args) {
        Data data = new Data();
        Provider provider = new Provider(data);
        Consumer consumer = new Consumer(data);
        new Thread(provider,"thread-provider").start();
        new Thread(consumer,"thread-consumer").start();
    }
}
