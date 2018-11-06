package com.unionpay.genericity;

/**
 * Created by puke on 2018/10/30
 */
public class Main {
    public static void main(String[] args) {
        IMessage<String> msg = new MessageImpl<>();
        System.out.println(msg.print("hhh"));

        IMessage<String> msg2 = new MessageImpl2();
        System.out.println(msg2.print("hhh2"));
    }
}
