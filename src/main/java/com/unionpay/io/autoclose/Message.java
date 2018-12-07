package com.unionpay.io.autoclose;

/**
 * created by poker on 2018/12/2
 */
public class Message implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("autoclose...");
        throw new Exception("force not to close");
    }

    public void print(){
        System.out.println("print method is Message");
    }
}
