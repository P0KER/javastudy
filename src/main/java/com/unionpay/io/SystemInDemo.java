package com.unionpay.io;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by puke on 2018/12/6
 */
public class SystemInDemo {
    public static void main(String[] args) throws IOException {
        InputStream input = System.in;
        //想输入中文需要使用内存字节流来处理
        /*ByteOutputStream output = new ByteOutputStream();
//        StringBuffer buf = new StringBuffer();
        int temp = 0;
        while((temp=input.read())!='\n'){
            *//*if(temp!='\n'){
                System.out.println((char)temp);
            }*//*
            output.write(temp);
//            buf.append((char)temp);
        }
        System.out.println(new String(output.toByteArray()));*/
//        System.out.println(buf.toString());
    }
}
