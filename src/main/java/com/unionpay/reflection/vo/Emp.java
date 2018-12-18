package com.unionpay.reflection.vo;

import java.util.Date;

/**
 * created by poker on 2018/12/8
 */
public class Emp {
    private String ename;
    private String job;
    private Double salary;
    private Date hireDate;
    private Dept dept;

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "ename='" + ename + '\'' +
                ", job='" + job + '\'' +
                ", salary=" + salary +
                ", hireDate=" + hireDate +
                ", dept=" + dept +
                '}';
    }
}
