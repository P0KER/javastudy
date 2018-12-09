package com.unionpay.reflection;

/**
 * created by poker on 2018/12/8
 */
public class TestEmpDemo {
    public static void main(String[] args) throws Exception{
        String value = "emp.name:poker|emp.job:PM";
        EmpAction action = new EmpAction();
        action.setValue(value);
        System.out.println(action.getEmp());
    }
}
