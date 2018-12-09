package com.unionpay.reflection.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * created by poker on 2018/12/8
 * getter,setter方法名称处理
 * 调用getter取得对象
 * 调用setter设置属性内容
 */
public class ObjectUtils {
    private ObjectUtils(){}

    public static void setObjectValue(Object wrapObject, String attribute, String value) throws Exception{
        Field field = wrapObject.getClass().getDeclaredField(attribute);
        if(field == null){
            field = wrapObject.getClass().getField(attribute);
        }
        if(field == null){
            return;
        }
        String methodName = "set" + StringUtils.initCap(attribute);
        Method method = wrapObject.getClass().getMethod(methodName, field.getType());
        method.invoke(wrapObject, value);
    }

    public static Object getObject(Object wrapObject, String attribute) throws Exception {
        String methodName = "get" + StringUtils.initCap(attribute);
        Field field = wrapObject.getClass().getDeclaredField(attribute);
        if(field == null){
            field = wrapObject.getClass().getField(attribute);
        }
        if(field == null){
            return null;
        }

        Method method = wrapObject.getClass().getMethod(methodName);
        return method.invoke(wrapObject);
    }
}
