package com.unionpay.reflection.asyncTask;

import java.lang.reflect.Method;

/**
 * Created by puke on 2018/12/25
 */
public abstract class AsyncTask {
    {
        try {
            Method method = this.getClass().getMethod("callback");
            System.out.println("method.getDeclaringClass() => " + method.getDeclaringClass());
            System.out.println("this.getClass() => " + this.getClass());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
    public void doo(){
        System.out.println("This is do in abstract class");
    }

    public void callback(){
        System.out.println("This is callback in abstract class");
    }
}
