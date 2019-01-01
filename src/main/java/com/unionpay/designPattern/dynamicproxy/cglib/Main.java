package com.unionpay.designPattern.dynamicproxy.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * created by poker on 2019/1/1
 */
public class Main {
    public static void main(String[] args) {
        Message message = new Message();
        Enhancer enhancer = new Enhancer(); //负责代理关系的操作程序类
        enhancer.setSuperclass(message.getClass());
        enhancer.setCallback(new MyProxy(message)); //代理对象
        //以上就动态配置好了类之间的代理关系
        Message tmp = (Message)enhancer.create();
        tmp.send();
    }
}
