package com.example.student.thtuan03;

/**
 * Created by Student on 8/28/2018.
 */

public class EmployeePFullTime extends Employee {
    @Override
    public double TinhLuong()
    {
        return 500;
    }
    @Override
    public String toString()
    {
        return super.toString()+"--> Full time="+TinhLuong()+"K";
    }
}
