package com.unionpay.ds.binarytree;

/**
 * Created by puke on 2018/11/13
 */
public class BinaryTree {
    class Node{
        private Comparable data;
        private Node left;
        private Node right;
        public Node(Object data){
            this.data = (Comparable) data;
        }
        public void addNode(Node newNode){
            if(this.data.compareTo(newNode.data) > 0){
                if(this.left == null){
                    this.left = newNode;
                }else{
                    this.left.addNode(newNode);
                }
            }else{
                if(this.right == null){
                    this.right = newNode;
                }else{
                    this.right.addNode(newNode);
                }
            }
        }
        public void toArrayNode(){
            if(this.left != null){
                this.left.toArrayNode();
            }
            BinaryTree.this.retData[BinaryTree.this.foot ++] = this.data;
            if(this.right != null){
                this.right.toArrayNode();
            }
        }
    }
    private Node root;
    private int count;   //保存个数
    private int foot = 0;
    private Object[]  retData;
    public Object[] toArray(){
        this.foot = 0;
        this.retData = new Object[count];
        this.root.toArrayNode();
        return this.retData;
    }

    public void add(Object data){
        if(data == null){
            return;
        }
        Node newNode = new Node((Comparable)data);
        if(root == null){
            root = newNode;
        }else{
            this.root.addNode(newNode);
        }
        this.count ++;
    }
}
