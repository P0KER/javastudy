package com.unionpay.lambda;

/**
 * Created by puke on 2018/10/30
 * 使用@FunctionalInterface注解声明函数式接口，即接口中有且仅有一个方法
 */
@FunctionalInterface
public interface IMessage {
    public void print();
}
