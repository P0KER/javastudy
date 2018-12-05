package com.unionpay.io;

import java.io.*;

/**
 * Created by puke on 2018/12/4
 */
public class CopyDemo {
    public static void main(String[] args) throws Exception {
        if(args.length!=2){
            System.err.println("参数错误！java CopyDemo");
            System.exit(1);
        }

        File input = new File(args[0]);
        File output = new File(args[1]);
        if(!input.exists()){
            System.err.println("源文件不存在！" + input.getName());
            System.exit(1);
        }
        if(!output.getParentFile().exists()){
            output.getParentFile().mkdirs();
        }

        long start = System.currentTimeMillis();

//        slowCopy(input, output);
        fastCopy(input, output);

        System.out.println(System.currentTimeMillis() - start);
    }

    public static void slowCopy(File input, File output) throws Exception{
        //begin to copy
        InputStream is = null;
        OutputStream os = null;
        try{
            is = new FileInputStream(input);
            os = new FileOutputStream(output);
            int tmp;
            while((tmp=is.read()) != -1){
                os.write(tmp);
            }
        } catch(Exception e){
        }finally {
            is.close();
            os.close();
        }
    }

    public static void fastCopy(File input, File output) throws Exception{
        InputStream is = null;
        OutputStream os = null;
        try{
            is = new FileInputStream(input);
            os = new FileOutputStream(output);
            int len;
            byte[] buf = new byte[2048];
            while((len=is.read(buf)) != -1){
                os.write(buf, 0, len);
            }
        } catch(Exception e){
        }finally {
            is.close();
            os.close();
        }
    }

}
