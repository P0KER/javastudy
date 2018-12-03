package com.unionpay.timer;

import java.util.Timer;

/**
 * Created by puke on 2018/11/28
 */
public class Main {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new MyTask(), 1000,2000);
    }
}
