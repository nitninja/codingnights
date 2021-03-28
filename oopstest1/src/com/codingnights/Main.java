package com.codingnights;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        patient Patient =new patient("kalinga",22,
                new eyes("left_eye","good","blue",true),
                new eyes("right eye","great","black",true),
                new heart("heart","good",75),
                new stomach("stomach","pud",false),
                new skin("skin","good","brown",40));
        System.out.println("name: "+ Patient.getName());
        System.out.println("age"+Patient.getAge());
        Scanner scan =new Scanner(System.in);
        boolean shouldfinish =false;
        while (!shouldfinish){
            System.out.println("choose an organ: "+
                    "\n\t1. left eye"+
                    "\n\t2. right eye"+
                    "\n\t3. heart"+
                    "\n\t4. stomach"+
                    "\n\t5. skin"+
                    "\n\t6. quit");
            int choice= scan.nextInt();
            switch (choice){
                case 1:
                    Patient.getLeft_eye().getdetails();
                    if (Patient.getLeft_eye().isIsopen()){
                        System.out.println("\t\t1. close the eye");
                        if (scan.nextInt()==1){
                            Patient.getLeft_eye().close();
                        }else continue;
                    }else {
                        System.out.println("\t\t1. open the eye");
                        if (scan.nextInt()==1){
                            Patient.getLeft_eye().open();
                        }else continue;
                    }
                    break;
                case 2:
                    Patient.getRight_eye().getdetails();
                    if (Patient.getRight_eye().isIsopen()){
                        System.out.println("\t\t1. close the eye");
                        if (scan.nextInt()==1){
                            Patient.getRight_eye().close();
                        }else continue;
                    }else {
                        System.out.println("\t\t1. open the eye");
                        if (scan.nextInt()==1){
                            Patient.getRight_eye().open();
                        }else {continue;}
                    }
                    break;
                case 3:
                    Patient.getHeart().getdetails();
                    System.out.println("\t\t1. change the heart rate");
                    if (scan.nextInt()==1){
                        System.out.println("ent the heart rate");
                        int newheartrate=scan.nextInt();
                        Patient.getHeart().setRate(newheartrate);
                        System.out.println("heart rate changed to:"+ Patient.getHeart().getRate());
                    }else {continue;}
                    break;
                case 4:
                    Patient.getStomach().getdetails();
                    System.out.println("\t\t1. digest");
                    if (scan.nextInt()==1){
                        Patient.getStomach().digest();
                    }else continue;
                    break;
                case 5:
                    Patient.getSkin().getdetails();
                    break;
                default:
                    shouldfinish=true;
                    break;
            }


        }
    }
}
