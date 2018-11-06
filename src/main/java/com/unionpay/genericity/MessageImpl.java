package com.unionpay.genericity;

/**
 * Created by puke on 2018/10/30
 */
public class MessageImpl<T> implements IMessage<T> {
    @Override
    public T print(T t) {
        return t;
    }
}
