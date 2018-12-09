package com.unionpay.reflection.demo;

import com.unionpay.reflection.action.DeptAction;

/**
 * created by poker on 2018/12/8
 */
public class TestDeptDemo {
    public static void main(String[] args) throws Exception{
        String value = "dept.dname:dpoker|dept.loc:shanghai";
        DeptAction action = new DeptAction();
        action.setValue(value);
        System.out.println(action.getDept());
    }
}
