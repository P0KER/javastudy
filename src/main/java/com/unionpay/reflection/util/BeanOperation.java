package com.unionpay.reflection.util;

/**
 * created by poker on 2018/12/8
 * 拆分字符串，区分出内容
 */
public class BeanOperation {

    private BeanOperation(){}

    /**
     * 负责设置类中属性操作
     * @param actionObject
     * @param msg
     */
    public static void setBeanValue(Object actionObject, String msg)throws Exception{
        String[] result = msg.split("\\|");
        for(int i = 0; i< result.length; i++){
            String[] temp = result[i].split(":");
            String attribute = temp[0];

            String[] fields = attribute.split("\\.");
            if(fields.length > 2){//多级配置
                Object currentObject = actionObject;
                for(int j = 0; j < fields.length - 1; j++){
                    currentObject = ObjectUtils.getObject(currentObject, fields[j]);
                }
                Object value = ObjectValueUtils.getValue(currentObject, fields[fields.length - 1],temp[1]);
                ObjectUtils.setObjectValue(currentObject, fields[fields.length - 1], value);
            }else{//单级配置
                Object currentObject = ObjectUtils.getObject(actionObject, fields[0]);
                Object value = ObjectValueUtils.getValue(currentObject, fields[1], temp[1]);
                ObjectUtils.setObjectValue(currentObject, fields[1], value);
            }

        }
    }
}
