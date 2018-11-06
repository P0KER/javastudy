package com.unionpay.methodReference;

/**
 * Created by puke on 2018/10/31
 */
public class Main {
    public static void main(String[] args) {
        //静态方法引用
        Convert<Integer, String> convert = String::valueOf;
        String str = convert.convert(1000);
        System.out.println(str);

        //引用类中的普通方法
        Compare<String,Integer> comp = String::compareTo;
        System.out.println(comp.比较("H", "h"));

        //引用某个对象中的方法
        UpperCase<String> upper = "hello"::toUpperCase;
        System.out.println(upper.upperCase());

        //构造引用
        IUtil<String,Integer,Person> iu = Person::new;
        System.out.println(iu.create("poker", 28));
    }
}
