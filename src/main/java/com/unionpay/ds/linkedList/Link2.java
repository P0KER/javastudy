package com.unionpay.ds.linkedList;

/**
 * Created by puke on 2018/10/22
 * 自己定义的建议单项链表（递归实现）
 */
public class Link2 {

    private Node root;
    private int count;
    private int foot;
    private Object[] retData;

    private class Node{
        private Object data;
        private Node next;

        public Node(Object data){
            this.data = data;
        }

        /**
         * 递归方式添加节点,处理节点关系
         * @param newNode
         */
        public void addNode(Node newNode){
            if(this.next == null){
                this.next = newNode;
                return ;
            }else{
                this.next.addNode(newNode);
            }
        }

        public void toArrayNode(){
            Link2.this.retData[Link2.this.foot ++] = this.data;
            if(this.next != null){
                this.next.toArrayNode();
            }
        }

        public boolean containsNode(Object data){
            if(data.equals(this.data)){
                return true;
            }else{
                if(this.next != null){
                    return this.next.containsNode(data);
                }
            }
            return false;
        }

        public Object getNode(int index){
            if(Link2.this.foot++ == index){
                return this.data;
            }else{
                if(this.next != null){
                    return this.next.getNode(index);
                }
            }
            return null;
        }

        public void setNode(int index, Object newData){
            if(Link2.this.foot++ == index){
                this.data = newData;
            }else{
                if(this.next != null){
                    this.next.setNode(index, newData);
                }
            }
        }

        public void removeNode(Node previous, Object data){
            if(data.equals(this.data)){
                previous.next = this.next;
            }else{
                this.next.removeNode(this, data);
            }
        }
    }

    public void add(Object data){
        if(data == null){
            return ;
        }
        count++;
        Node newNode = new Node(data);
        if(root == null){
            root = newNode;
            return;
        }
        root.addNode(newNode);
    }

    public void printData(){
        Node pNode = root;
        while(pNode != null){
            System.out.println(pNode.data);
            pNode = pNode.next;
        }
    }

    public Object[] toArray(){
        if(count == 0){
            return null;
        }
        retData = new Object[count];
        foot = 0;
        root.toArrayNode();
        return retData;
    }

    public int size(){
        return count;
    }

    public boolean contains(Object data){
        if(data == null || root == null){
            return false;
        }
        return root.containsNode(data);
    }

    public Object get(int index){
        if(index >= count){
            return null;
        }
        int foot = 0;
        return this.root.getNode(index);
    }

    public void set(int index, Object newData){
        if(index >= count){
            return;
        }
        this.foot = 0;
        this.root.setNode(index, newData);
    }

    public void remove(Object data){
        if(data.equals(this.root.data)){
            root = root.next;
        }else{
            root.next.removeNode(root, data);
        }
        count--;
    }
}
