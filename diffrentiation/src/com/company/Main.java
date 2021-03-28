package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        System.out.println("what type of differentiation you wanna solve:");
        System.out.println("1. For simple equation");
        System.out.println("2. For trigonometric");
        Scanner scan=new Scanner(System.in);
        String selectparse=scan.nextLine();
        int select=Integer.parseInt(selectparse);
        if(select==1){
            String constant;
            String power;
            String variable;

            System.out.print("Enter the Constant:");
            constant=scan.nextLine();

            System.out.print("Enter the variable:");
            variable=scan.nextLine();
            System.out.print("Enter the value of Power:");
            power=scan.nextLine();
            System.out.println("your equation is :"+constant+"("+variable+")"+"^"+power);

//            int Final=1;
//            if(power.{
//                int pow=Integer.parseInt(power);
//                for (int i=1;i<=pow;i++){
//                    Final*=i;
//                }}

            int pow=Integer.parseInt(power);
            int cons=Integer.parseInt(constant);
            if(pow==0){
                System.out.println("Kid differentiation is:"+cons+"\nLoL!!");
            }
            else {

                int minusone = pow - 1;
                int Finalcons = pow * cons;
                System.out.println("Your differentiation is:" + "=> " + Finalcons + variable + "^" + minusone);

            }

        }
        else if(select==2){
            String constant;
            String power;
            String variable;
            String variable2;
            System.out.println("Enter the constant:");
            constant=scan.nextLine();
            System.out.println("Enter the trigonometric ratio(without x)");
            variable2=scan.nextLine();
            System.out.println("Enter the variable of trigonometric ratio:");
            variable=scan.nextLine();
            System.out.println("Enter the exponential power of this variable:");
            power=scan.nextLine();
            System.out.println("Your equation is:"+constant+variable2+"("+variable+")"+"^"+power);
            int pow=Integer.parseInt(power);
            int cons=Integer.parseInt(constant);
            int Finalpow=pow-1;
            int Finalcons=cons*pow;
//            String var2;
            if (variable2.equals("sin"))
            {
                 variable2="cos";
            }
            if (variable2.equals("cos")){
                 variable2="+sin";
            }
            if (variable2.equals("tan")){
                variable2="+sec^2";
            }
            if (variable2.equals("cot")){
                variable2="-cosec^2";
            }
            if (variable2.equals("sec")){
                variable2="sec"+variable+"*"+"tan"+variable;
            }
            if (variable2.equals("cosec")){
                variable2="-cosec"+variable+"*"+"cot"+variable;
            }

            System.out.println("After differentiation equation is:"+Finalcons+variable+"^"+Finalpow+"("+variable2+")"+variable+"^"+pow);
            System.out.println("QED...");
        }


/*
        Scanner scan =new Scanner(System.in);
        int x;
        int y;
        int Final=1;
        System.out.println("x");
        x=scan.nextInt();
        System.out.println("y");
        y=scan.nextInt();
        for(int i=1;i<=x;i++){
            Final*=i;
        }
               System.out.println(Final);
*/
    }
}
