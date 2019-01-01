package com.unionpay.designPattern.factory.annotation;

import com.unionpay.designPattern.factory.Orange;

import java.lang.annotation.Annotation;

/**
 * created by poker on 2019/1/1
 */
@MyAnnotation(target = Orange.class)
public class AnnotationFactory {

    public static <T> T getInstance() throws IllegalAccessException, InstantiationException {
        Annotation ant = AnnotationFactory.class.getAnnotation(MyAnnotation.class);
        return (T)((MyAnnotation) ant).target().newInstance();
    }
}
