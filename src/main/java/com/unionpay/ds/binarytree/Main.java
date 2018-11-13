package com.unionpay.ds.binarytree;

import java.util.Arrays;

/**
 * Created by puke on 2018/11/13
 */
public class Main {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.add("C");
        bt.add("B");
        bt.add("A");
        System.out.println(Arrays.toString(bt.toArray()));
    }
}
