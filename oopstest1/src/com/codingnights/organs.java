package com.codingnights;

public class organs {
    private String names;
    private String medical_condition;

    public organs(String names, String medical_condition) {
        this.names = names;
        this.medical_condition = medical_condition;
    }
    public void getdetails(){
        System.out.println("names"+ this.getNames());
        System.out.println("medical condition"+ this.getMedical_condition());
    }

    public String getNames() {
        return names;
    }
    public void setNames(String names) {
        this.names = names;
    }
    public String getMedical_condition() {
        return medical_condition;
    }

    public void setMedical_condition(String medical_condition) {
        this.medical_condition = medical_condition;
    }
}

