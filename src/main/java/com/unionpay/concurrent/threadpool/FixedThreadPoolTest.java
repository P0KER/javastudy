package com.unionpay.concurrent.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * created by poker on 2018/11/4
 */
public class FixedThreadPoolTest {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for(int i = 0; i < 10; i++){
            final int index = i;
            executorService.submit(() -> {
                System.out.println(Thread.currentThread() + ", i = " + index);
            });
        }
        executorService.shutdown();
    }
}
