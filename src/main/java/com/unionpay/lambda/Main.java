package com.unionpay.lambda;

/**
 * Created by puke on 2018/10/30
 */
public class Main {
    public static void main(String[] args) {
        //1. 使用匿名内部类
        /*IMessage msg = new IMessage() {
            @Override
            public void print() {
                System.out.println("bbb");
            }
        };
        msg.print();*/
        //2. 使用lambda表达式
        IMessage msg = () -> System.out.println("bbb");
        msg.print();

        IMath math = (p1, p2) -> {
            int temp = p1;
            System.out.println(temp);
            return p1 + p2;
        };
        System.out.println(math.add(1, 2));

    }
}
