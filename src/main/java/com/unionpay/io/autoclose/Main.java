package com.unionpay.io.autoclose;

/**
 * created by poker on 2018/12/2
 */
public class Main {
    public static void main(String[] args)throws Exception {
        try(Message msg = new Message()){
            msg.print();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
