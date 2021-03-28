package com.company;

public class overloading
{
    private int rollNum;
    overloading()
    {
        rollNum =100;
    }
    overloading(int rnum)
    {

        rollNum = rollNum+ rnum;
        this();
    }
    public int getRollNum() {
        return rollNum;
    }
    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }