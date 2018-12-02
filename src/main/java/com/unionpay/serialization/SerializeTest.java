package com.unionpay.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * created by poker on 2018/11/19
 */
public class SerializeTest implements Serializable {

    private static final long serialVersionUID = 133959841213555763L;
    private int num = 1390;

    public static void main(String[] args) {
        try{
            FileOutputStream fos = new FileOutputStream("/Users/poker/Documents/serialize.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            SerializeTest serializeTest = new SerializeTest();
            oos.writeObject(serializeTest);
            oos.flush();
            oos.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
