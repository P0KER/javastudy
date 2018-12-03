package com.unionpay.io;

import java.io.FileReader;

/**
 * created by poker on 2018/11/19
 */
public class ReadTest {
    public static void main(String[] args) {
        try{
            StringBuffer str = new StringBuffer();
            char[] buff = new char[1024];
            FileReader f = new FileReader("d:\\tmp\\test");
            int tmp;
            while((tmp = f.read(buff))> 0 ){
                System.out.println("tmp --> " + tmp);
                str.append(buff);
            }
            System.out.println(str.length());
        }catch(Exception e){
            FileReader f = new FileReader("/Users/poker/Documents/test");
            while(f.ready()){
                f.read(buff);
                str.append(buff);
            }
            System.out.println(str.toString());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
