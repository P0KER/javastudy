package com.unionpay.ds.linkedList;

/**
 * Created by puke on 2018/10/22
 */
public class LinkTest {
    public static void main(String[] args) {
        Link2 link = new Link2();
        link.add("aaa");
        link.add("bbb");
        link.add("ccc");
        link.remove("aaa");
        for(Object o : link.toArray()){
            System.out.println(o);
        }
    }
}
