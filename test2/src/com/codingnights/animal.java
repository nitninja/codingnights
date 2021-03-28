package com.codingnights;

public class animal {
    private String name;
    private String color;
    private int legs;
    private boolean hastail;

    public animal(String name, String color, int legs, boolean hastail) {
        this.name = name;
        this.color = color;
        this.legs = legs;
        this.hastail = hastail;
    }
    public void eat(String food){
        System.out.println(name+" eaten "+food);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public boolean isHastail() {
        return hastail;
    }

    public void setHastail(boolean hastail) {
        this.hastail = hastail;
    }
}
