package com.unionpay.reflection.action;

import com.unionpay.reflection.util.BeanOperation;
import com.unionpay.reflection.vo.Dept;

/**
 * created by poker on 2018/12/9
 */
public class DeptAction {

    private Dept dept = new Dept();

    public Dept getDept(){
        return dept;
    }

    public void setValue(String val)throws Exception{
        BeanOperation.setBeanValue(this, val);
    }
}
