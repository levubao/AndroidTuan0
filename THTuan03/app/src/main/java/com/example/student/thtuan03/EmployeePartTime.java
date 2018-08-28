package com.example.student.thtuan03;

/**
 * Created by Student on 8/28/2018.
 */

public class EmployeePartTime extends Employee {
    @Override
    public double TinhLuong() {
        return 150;
    }
    @Override
    public String toString()
    {
        return super.toString()+"--> Part time="+TinhLuong();
    }

}
