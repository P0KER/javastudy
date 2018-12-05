package com.unionpay.io;

import java.io.*;

/**
 * Created by puke on 2018/12/5
 */
public class ByteArrayInOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        String msg = "hello world!";
        InputStream input = new ByteArrayInputStream(msg.getBytes());
        OutputStream output = new ByteArrayOutputStream();
        int temp = 0;
        while((temp=input.read())!= -1){
            output.write(Character.toUpperCase(temp));
        }
        System.out.println(output);
        output.close();
        input.close();
    }
}
