package com.codingnights;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        Map<String,String>  birthdays=new HashMap<>();
        birthdays.put("nitish","5 april");
        birthdays.put("nilam","27 oct");
        birthdays.put("papa","1 feb");
        birthdays.put("deepak","31 june");
        birthdays.put("jigyansh","17 july");
        birthdays.put("arnab", "30 oct");
        System.out.println(birthdays.get("nitish"));
        System.out.println(birthdays.entrySet()) ;
        System.out.println(birthdays.get(scan.nextLine()));
//        ArrayList<Students> student =new ArrayList<>();
//            student.add(new Students("nitish",26));
//            student.add(new Students("ninja",43));
//             for (Students stu: student){
//                System.out.println(stu.getName()+" "+ stu.getId());
//            }
        }

}
