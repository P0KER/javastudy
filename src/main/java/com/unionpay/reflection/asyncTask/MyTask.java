package com.unionpay.reflection.asyncTask;

/**
 * Created by puke on 2018/12/25
 */
public class MyTask extends AsyncTask{
    @Override
    public void doo() {
        System.out.println("doo in MyTask class");
    }

    /*@Override
    public void callback() {
        System.out.println("callback in MyTask class");
    }*/
}
