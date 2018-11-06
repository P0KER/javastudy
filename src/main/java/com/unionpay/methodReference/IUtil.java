package com.unionpay.methodReference;

/**
 * Created by puke on 2018/10/31
 */
@FunctionalInterface
public interface IUtil<PA,PB,R> {
    public R create(PA pa, PB pb);
}
