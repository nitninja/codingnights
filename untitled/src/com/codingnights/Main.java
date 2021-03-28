package com.codingnights;

public class Main {
    public static void main (String[] args){


       Phone iphone=new Phone("iphone 12",7,4,12);

        System.out.println(iphone.getName());
        System.out.println(iphone.getCamera());
        System.out.println(iphone.getMemoryram());
        System.out.println(iphone.getScreensize());

        iphone.music("yo_ninja");
        Phone oneplus=new Phone("oneplus 8t",8);
        System.out.println(oneplus.getName());
        System.out.println(oneplus.getMemoryram());


    }
}
