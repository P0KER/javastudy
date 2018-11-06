package com.unionpay.methodReference;

/**
 * Created by puke on 2018/10/31
 */
@FunctionalInterface
public interface Convert<P,R> {
    public R convert(P p);
}
