package com.codingnights;

public class stomach extends organs {
    private boolean isempty;

    public stomach(String names, String medical_condition, boolean isempty) {
        super(names, medical_condition);
        this.isempty = isempty;
    }
    public void digest(){
        System.out.println("digestion initiated");
    }
    @Override
    public void getdetails() {
        super.getdetails();
        if (this.isIsempty()){
            System.out.println("need some food");
        }
        else System.out.println("no need to feed");
    }


    public boolean isIsempty() {
        return isempty;
    }

    public void setIsempty(boolean isempty) {
        this.isempty = isempty;
    }
}
