package com.unionpay.reflection.action;

import com.unionpay.reflection.util.BeanOperation;
import com.unionpay.reflection.vo.Emp;

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
