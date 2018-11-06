package com.unionpay.methodInterface;

import java.util.function.*;

/**
 * Created by puke on 2018/10/31
 */
public class Main {
    public static void main(String[] args) {
        //功能型接口
        Function<Integer, String> fun = String::valueOf;
        System.out.println(fun.apply(100));
        IntFunction<String> fun1 = String::valueOf;
        System.out.println(fun1.apply(100));

        //供给型接口(无参数，有返回值)
        Supplier<String> supplier = "hello"::toUpperCase;
        System.out.println(supplier.get());

        //消费型接口(有参数，无返回值)
        Consumer<String> cons = System.out::println;
        cons.accept("hello world!");

        //断言型接口(一个参数，并且返回值是boolean)
        Predicate<String> predicate = "##hello"::startsWith;
        System.out.println(predicate.test("##"));
    }
}
