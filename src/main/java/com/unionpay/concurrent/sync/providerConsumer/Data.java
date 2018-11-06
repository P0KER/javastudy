package com.unionpay.concurrent.sync.providerConsumer;

/**
 * created by poker on 2018/11/4
 */
public class Data {
    private String title;
    private String desc;
    private boolean flag = false; //false => 不可以消费 true => 可以消费

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public synchronized void set(String title, String desc){
        System.out.println(Thread.currentThread().getName() + " start, method = set");
        if(flag == true){
            try {
                System.out.println(Thread.currentThread().getName() + " waiting...");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        setTitle(title);
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        setDesc(desc);
        flag = true;
        notify();
    }

    public synchronized void get(){
        System.out.println(Thread.currentThread().getName() + " start, method = get");
        if(flag == false){
            try {
                System.out.println(Thread.currentThread().getName() + " waiting...");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(title + " = " + desc);
        flag = false;
        this.notify();
    }
}
