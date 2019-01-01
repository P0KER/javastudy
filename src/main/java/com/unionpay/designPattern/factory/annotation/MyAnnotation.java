package com.unionpay.designPattern.factory.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * created by poker on 2019/1/1
 */
@Retention(RetentionPolicy.RUNTIME) //表示此annotation在运行时生效
public @interface MyAnnotation { //定义了一个自己的Annotation
    public Class<?> target();
}
