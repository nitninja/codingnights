package com.codingnights;

public class eyes extends organs {
    private String color;
    private boolean isopen;

    public eyes(String names, String medical_condition,  String color, boolean isopen) {
        super(names, medical_condition);

        this.color = color;
        this.isopen = isopen;
    }

    @Override
    public void getdetails() {
        super.getdetails();
        System.out.println("color: "+ this.getColor());
    }
    public void open(){
        this.setIsopen(true);
        System.out.println(this.getNames()+"openes");
    }
    public void close(){
        this.setIsopen(false);
        System.out.println(this.getNames()+"closed");
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isIsopen() {
        return isopen;
    }

    public void setIsopen(boolean isopen) {
        this.isopen = isopen;
    }
}
