package com.company;

public class Main {

    private String message;

    public overloading(){
        message = "Hi there!!";
    }
    public overloading(String message){
        this.message = message;
    }

    public String getMessage(){
        return message ;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public static void main(String[] args) {
        overloading Overloading = new overloading();
        System.out.println(Overloading.getMessage());

        overloading Overloading1 = new overloading("this is my program");
        System.out.println(Overloading1.getMessage());
    }
}