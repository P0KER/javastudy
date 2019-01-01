package com.unionpay.designPattern.dynamicproxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * created by poker on 2019/1/1
 */
public class MyProxy implements MethodInterceptor {
    private Object target;

    public MyProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        //定义一个拦截器
        this.prepare();
        Object ret = method.invoke(this.target, objects);
        this.over();
        return ret;
    }

    public void prepare(){
        System.out.println("打开电脑");
    }

    public void over(){
        System.out.println("关闭电源");
    }
}
