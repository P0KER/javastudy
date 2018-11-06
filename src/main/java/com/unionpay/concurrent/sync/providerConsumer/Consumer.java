package com.unionpay.concurrent.sync.providerConsumer;

/**
 * created by poker on 2018/11/4
 */
public class Consumer implements Runnable{

    private Data data;

    public Consumer(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        for(int i = 0; i < 50; i++){
            data.get();
        }
    }
}
