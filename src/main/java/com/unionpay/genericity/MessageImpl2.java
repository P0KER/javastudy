package com.unionpay.genericity;

/**
 * Created by puke on 2018/10/30
 */
public class MessageImpl2 implements IMessage<String> {
    @Override
    public String print(String s) {
        return s;
    }
}
