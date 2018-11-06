package com.unionpay.ds.linkedList;

/**
 * Created by puke on 2018/10/22
 * 自己定义的建议单项链表
 */
public class Link {

    private Node root;
    private int count;

    private class Node{
        private Object data;
        private Node next;
        public Node(Object data){
            this.data = data;
        }
    }

    public void add(Object data){
        if(data == null){
            return ;
        }
        count ++;
        Node newNode = new Node(data);
        if(root == null){
            root = newNode;
            return ;
        }
        Node pNode = root;
        while(pNode.next != null){
            pNode = pNode.next;
        }
        pNode.next = newNode;
    }

    public void printData(){
        Node pNode = root;
        while(pNode != null){
            System.out.println(pNode.data);
            pNode = pNode.next;
        }
    }

    public Object[] toArray(){
        Object[] objArr = new Object[count];
        int curIndex = 0;
        Node pNode = root;
        while(pNode != null){
            objArr[curIndex++] = pNode.data;
            pNode = pNode.next;
        }
        return objArr;
    }

    public int size(){
        return count;
    }

    public boolean contains(Object data){
        if(data == null || root == null){
            return false;
        }
        Node pNode = root;
        while(pNode != null){
            if(data.equals(pNode.data)){
                return true;
            }else{
                pNode = pNode.next;
            }
        }
        return false;
    }
}
