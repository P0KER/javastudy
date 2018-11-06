package com.unionpay.genericity;

/**
 * Created by puke on 2018/10/30
 */
public interface IMessage<T> {
    public T print(T t);
}
