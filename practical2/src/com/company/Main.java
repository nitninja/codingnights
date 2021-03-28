package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("\t#####PRACTICAL 2#####\n Quadratic solver: ");
        System.out.println("ENTER ANY THREE NUMBER YOU LIKE: ");
        System.out.print("value of a:");
        String a= scanner.nextLine();
        System.out.print("value of b:");

        String b= scanner.nextLine();
        System.out.print("value of c:");
        String c= scanner.nextLine();
        System.out.print("your quadratic equation is: ");
        System.out.println(a+"x^2+"+b+"x+"+c);
        System.out.print("Do you want to solve it(y/n):");
        String tostart=scanner.nextLine();
        if (tostart.equals("y") || tostart.equals("Y"))
        {
            int q=Integer.parseInt(b);
            int w=Integer.parseInt(a);
            int e=Integer.parseInt(c);
            double t=Math.pow(q,2);
            double r= t-(4*w*e);
            double y=Math.pow(r,0.5);
            double x1=(-q+y)/(2*w);
            double x2=(-q-y)/(2*w);
            System.out.println("First real root:"+x1);
            System.out.println("Second real root:"+x2);
        }
        else if ( tostart.equals("n")||tostart.equals("N")){
            System.out.println("ok");
        }
        else {
            System.out.println("ENTER A RIGHT INPUT");
        }
    }
}

