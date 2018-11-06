package com.unionpay.designPattern.multiInstances;

/**
 * Created by puke on 2018/10/30
 * 多例设计模式
 * JDK1.5之前使用多例模式可以限制本类实例化对象的产生个数
 */
public class Color {

    private static final Color RED = new Color("RED");
    private static final Color BLUE = new Color("BLUE");
    private static final Color GREEN = new Color("GREEN");

    private String title;
    private Color(String title){
        this.title = title;
    }

    public static Color getInstance(int ch){
        switch(ch){
            case 0:
                return RED;
            case 1:
                return BLUE;
            case 2:
                return GREEN;
            default:
                return null;
        }

    }

    @Override
    public String toString() {
        return "Color{" +
                "title='" + title + '\'' +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(Color.getInstance(0));
    }
}
