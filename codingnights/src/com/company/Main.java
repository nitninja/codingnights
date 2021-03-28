package com.company;


import java.util.Random;

public class Main {

    public static void main(String[] args) {

//Thread thread=new Thread(() -> {
//    for (int i=0 ;i<10;i++){
//        System.out.println("worker thread"+ i);
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//});thread.start();
//        for (int i=0 ;i<10;i++){
//            System.out.println("main thread"+ i);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
// }


//        int rnm;
//        int cube;
//       for (int i=0;i<11;i++) {
//
//           Random random = new Random();
//           rnm = random.nextInt(30);
//       }
//        Thread thread = new Thread(() -> {
//            for (int i = 0; i < 11; i++) {
//
//                if (rnm%2==0){
//                    int square;
//                    square=rnm*rnm;
//                    System.out.println(square);
//                }
//
//                try{
//                    Thread.sleep(1000);
//                }catch(InterruptedException e){
//                    e.printStackTrace();
//                }
//            }
//        });
//      thread.start();
//          for (int i=0;i<11;i++){
//
//              System.out.println(rnm);
//              System.out.println("working..");
//              try {
//                  Thread.sleep(1000);
//              }catch (InterruptedException e){
//                  e.printStackTrace();
//              }
//    }

        Database database = new Database.getInstance("nitish");




    }}
