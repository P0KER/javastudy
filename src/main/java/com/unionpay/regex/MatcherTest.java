package com.unionpay.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by puke on 2018/11/29
 */
public class MatcherTest {
    public static void main(String[] args) {
        /*Pattern p = Pattern.compile("\\[.+\\]\\[.+\\]");
        Matcher m = p.matcher("[che][1]'s blog is [rebey.cn][2],and built in [2016][3].");
        while(m.find()) {
            System.out.println(m.group());
        }*/

        /*Pattern p1 = Pattern.compile("\\[.+?\\]\\[.+?\\]");
        Matcher m1 = p1.matcher("[che][1]'s blog is [rebey.cn][2],and built in [2016][3].");
        while(m1.find()) {
            System.out.println(m1.group());
        }*/

        /*Pattern p2 = Pattern.compile("\\[.++\\]\\[.++\\]");
        Matcher m2 = p2.matcher("[che][1]");
        while(m2.find()) {
            System.out.println(m2.group());
        }*/

//        System.out.println("\"abc\"x".matches("\".*\""));
        Pattern pattern = Pattern.compile("\".*+\"");
        Matcher matcher = pattern.matcher("\"abc\"x");
        while(matcher.find()){
            System.out.println(matcher.group());
        }

    }
}
