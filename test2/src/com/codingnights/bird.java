package com.codingnights;

public class bird extends animal{
    private String wings;
    public bird(String name, String color, int legs, boolean hastail,String wings) {
        super(name, color, legs, hastail);
        this.wings=wings;
    }

    public String getWings() {
        return wings;
    }

    public void setWings(String wings) {
        this.wings = wings;
    }
}
