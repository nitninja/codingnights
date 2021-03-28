package com.codingnights;

public class heart extends organs{
    private int rate;

    public heart(String names, String medical_condition, int rate) {
        super(names, medical_condition);
        this.rate = rate;
    }

    @Override
    public void getdetails() {
        super.getdetails();
        System.out.println("heart rate: "+ this.getRate());
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}
