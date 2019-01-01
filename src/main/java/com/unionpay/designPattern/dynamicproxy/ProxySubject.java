package com.unionpay.designPattern.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * created by poker on 2019/1/1
 */
public class ProxySubject implements InvocationHandler {//是一个动态代理类
    private Object target; //绑定任意的接口的对象，实用Object描述

    /**
     * 实现真实对象的绑定处理，同时返回代理对象
     * @param target
     * @return 返回一个代理对象（这个对象是根据接口定义动态创建形成的代理对象）
     */
    public Object bind(Object target){
        this.target = target; //保存真实主题对象
//        System.out.println("target.getClass().getInterfaces() : " + Arrays.toString(target.getClass().getInterfaces()));
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }

    public void prepare(){
        System.out.println("【ProxySubject】准备食材！");
    }

    public void clear(){
        System.out.println("【ProxySubject】收拾碗筷！");
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        System.out.println(proxy.getClass());
//        System.out.println(method);
//        System.out.println(Arrays.toString(args));
//        return null;
        this.prepare();
        Object ret = method.invoke(proxy, args);
        this.clear();
        return ret;
    }
}
