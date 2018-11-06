package com.unionpay.concurrent.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * created by poker on 2018/11/4
 */
public class CachedThreadPoolTest {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for(int i = 0; i <  20; i++){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            final int index = i;
            executorService.submit(() -> System.out.println(Thread.currentThread() + ", i = " + index));
        }
        executorService.shutdown();
    }
}
