package com.unionpay.reflection.demo;

import com.unionpay.reflection.action.EmpAction;

/**
 * created by poker on 2018/12/8
 */
public class TestEmpDemo {
    public static void main(String[] args) throws Exception{
        String value = "emp.ename:poker" +
                "|emp.job:PM" +
                "|emp.dept.dname:finance" +
                "|emp.dept.company.name:unionpay" +
                "|emp.dept.company.address:gutang road" +
                "|emp.salary:19999.12" +
                "|emp.hireDate:1990-09-20" +
                "|emp.dept.count:202849324" +
                "|emp.dept.company.cid:10" +
                "|emp.dept.company.create:1990-09-23";
        EmpAction action = new EmpAction();
        action.setValue(value);
        System.out.println(action.getEmp());
    }
}
