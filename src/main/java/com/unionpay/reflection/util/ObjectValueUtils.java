package com.unionpay.reflection.util;

import java.lang.reflect.Field;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * created by poker on 2018/12/9
 */
public class ObjectValueUtils {

    private ObjectValueUtils(){}

    public static Object getValue(Object wrapObject, String attribute, String value) throws Exception{
        Field field = ObjectUtils.getObjectField(wrapObject,attribute);
        if(field == null){
            return null;
        }
        return stringToType(field.getType().getSimpleName(), value);
    }

    public static Object stringToType(String type, String value){
        if("String".equals(type)){
            if(isNotEmpty(value)){
                return value;
            }else{
                return null;
            }
        }else if("int".equals(type) || "Integer".equals(type)){
            if(isInt(value)){
                return Integer.parseInt(value);
            }
        }else if("double".equals(type) || "Double".equals(type)){
            if(isDouble(value)){
                return Double.parseDouble(value);
            }
        }else if("long".equals(type) || "Long".equals(type)){
            if(isInt(value)){
                return Long.parseLong(value);
            }
        }else if("Date".equals(type)){
            String pattern = null;
            if(isDate(value)){
                pattern = "yyyy-MM-dd";
            }else if(isDatetime(value)){
                pattern = "yyyy-MM-dd HH:mm:ss";
            }
            if(pattern != null){
                try{
                    return new SimpleDateFormat(pattern).parse(value);
                }catch(ParseException e){
                    e.printStackTrace();
                }
            }else {
                return null;
            }
        }
        return null;
    }

    private static boolean isDate(String str){
        if(isNotEmpty(str)){
            return str.matches("\\d{4}-\\d{2}-\\d{2}");
        }
        return false;
    }

    private static boolean isDatetime(String str){
        if(isNotEmpty(str)){
            return str.matches("\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}");
        }
        return false;
    }

    private static boolean isNotEmpty(String str){
        return !(str == null || str.isEmpty() || "".equals(str));
    }

    private static boolean isInt(String str){
        if(isNotEmpty(str)){
            return str.matches("\\d+");
        }
        return false;
    }

    private static boolean isDouble(String str){
        if(isNotEmpty(str)){
            return str.matches("\\d+(\\.\\d+)?");
        }
        return false;
    }
}
