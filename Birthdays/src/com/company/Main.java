package com.company;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Map<String, String> birthdays = new HashMap<>();
        birthdays.put("nitish", "5 april");
        birthdays.put("nilam", "27 oct");
        birthdays.put("papa", "1 feb");
        birthdays.put("deepak", "31 june");
        birthdays.put("jigyansh", "17 july");
        birthdays.put("arnab", "30 oct");
        birthdays.put("test", "34");
        birthdays.
        //System.out.println(birthdays.entrySet());
        Scanner scan=new Scanner(System.in);

        for (; ;){
            System.out.println("1. search");
            System.out.println("2. list");
            System.out.println("3. exit");
            //System.out.println(scan.hasNext());

            String getinput =scan.nextLine();
            int userinput=Integer.parseInt(getinput);
             //todo adding birthdays to database pernmanently
            if (userinput==1){
                //TODO search by months ,recent upcoming birthdays,make it beautiful
                System.out.println(birthdays.get(scan.nextLine()));
            }
            else if (userinput==2){
                System.out.println(birthdays.entrySet());
            }
            else if (userinput==3){
                System.out.println("have a nice day");
                break;
            }
            else  {
                System.out.println("invalid enter");
            }

    }}}

