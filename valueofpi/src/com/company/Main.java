package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int circ_pnt = 0;
        int total_pnt = 0;
        Random randomx = new Random();
        Random randomy = new Random();

        for (int i=0;i<1000000000;i++) {

            float x = randomx.nextFloat()*(1);
            float y = randomy.nextFloat()*(1);
            float d = (x * x) + (y * y);

            if (d <= 1) {
                circ_pnt++;
            }
            total_pnt++;
        }

        float divide = (float) circ_pnt / total_pnt;
        float pi = 4*divide;
        System.out.println(pi);
	// write your code here
    }
}
