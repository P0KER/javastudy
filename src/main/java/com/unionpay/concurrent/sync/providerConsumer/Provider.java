package com.unionpay.concurrent.sync.providerConsumer;

/**
 * created by poker on 2018/11/4
 */
public class Provider implements Runnable{

    private Data data;

    public Provider(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        for(int i = 0; i < 50; i++){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(i % 2 == 0){
                data.set("A","SUCCESS");
            }else{
                data.set("B","FAIL");
            }
        }
    }
}
