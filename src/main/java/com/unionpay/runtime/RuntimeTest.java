package com.unionpay.runtime;

/**
 * Created by puke on 2018/11/5
 */
public class RuntimeTest {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("1. FREE: " + byteToMb(runtime.freeMemory()));
        System.out.println("1. TOTAL: " + byteToMb(runtime.totalMemory()));
        System.out.println("1. MAX: " + byteToMb(runtime.maxMemory()));

        String str = "";
        for(int i = 0; i < 2222; i++){
            str += i;
        }

        System.out.println("2. FREE: " + byteToMb(runtime.freeMemory()));
        System.out.println("2. TOTAL: " + byteToMb(runtime.totalMemory()));
        System.out.println("2. MAX: " + byteToMb(runtime.maxMemory()));

        System.out.println("After gc....");
        runtime.gc();
        System.out.println("3. FREE: " + byteToMb(runtime.freeMemory()));
        System.out.println("3. TOTAL: " + byteToMb(runtime.totalMemory()));
        System.out.println("3. MAX: " + byteToMb(runtime.maxMemory()));
    }

    public static double byteToMb(long num){
        return (double) num / 1024 / 1024;
    }
}
