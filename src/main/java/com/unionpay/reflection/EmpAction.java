package com.unionpay.reflection;

import com.unionpay.reflection.util.BeanOperation;

/**
 * created by poker on 2018/12/8
 */
public class EmpAction {
    private Emp emp = new Emp();

    public Emp getEmp() {
        return emp;
    }

    public void setValue(String val)throws Exception{
        BeanOperation.setBeanValue(this, val);
    }
}
