package com.unionpay.regex;

/**
 * Created by puke on 2018/11/28
 */
public class IsNumber {
    public static void main(String[] args) {
        String str1 = "123";
        String str2 = "abc";
        System.out.println(isNumber(str1));
        System.out.println(isNumber(str2));
    }
    public static boolean isNumber(String str){
        char[] arr = str.toCharArray();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < '0' || arr[i] > '9'){
                return false;
            }
        }
        return true;
    }
}
