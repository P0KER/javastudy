package com.unionpay.methodReference;

/**
 * Created by puke on 2018/10/31
 */
@FunctionalInterface
public interface Compare<P,R> {
    public R 比较(P p1, P p2);
}
