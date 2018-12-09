package com.unionpay.reflection.vo;

import java.util.Date;

/**
 * created by poker on 2018/12/9
 */
public class Company {

    private Integer cid;
    private String name;
    private String address;
    private Date create;

    public String getName() {
        return name;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreate() {
        return create;
    }

    public void setCreate(Date create) {
        this.create = create;
    }

    @Override
    public String toString() {
        return "Company{" +
                "cid=" + cid +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", create=" + create +
                '}';
    }
}
