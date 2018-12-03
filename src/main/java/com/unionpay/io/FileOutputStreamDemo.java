package com.unionpay.io;

import java.io.*;

/**
 * Created by puke on 2018/12/3
 */
public class FileOutputStreamDemo {
    public static void main(String[] args) throws Exception {
        File file = new File("D:/tmp/hello.txt");
        //字符流输出，有缓存的概念，flush是从缓存对外输出
        Writer out = new FileWriter(file);
        String str = "你好，世界和平！";
        out.write(str);
        out.close();       //不调用close则不输出内容，内容都还在缓存中没有flush出去

        //字节流输出
        File file1 = new File("D:/tmp/hello1.txt");
        OutputStream out1 = new FileOutputStream(file1);
        out1.write(str.getBytes());
    }
}
