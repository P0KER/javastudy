package com.unionpay.io;

import java.io.File;
import java.io.IOException;

/**
 * created by poker on 2018/12/2
 */
public class FileDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users" + File.separator + "poker" + File.separator + "hello" + File.separator + "hello.txt");
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        file.createNewFile();
    }
}
