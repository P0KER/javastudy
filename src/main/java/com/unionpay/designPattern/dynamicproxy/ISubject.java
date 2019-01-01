package com.unionpay.designPattern.dynamicproxy;

/**
 * created by poker on 2019/1/1
 */
public interface ISubject {//代理设计的核心是需要有一个核心的操作接口
    void eat(String msg, int num);//吃饭是整体的核心业务
}
