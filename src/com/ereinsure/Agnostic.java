package com.ereinsure;

import java.util.concurrent.ThreadLocalRandom;

public class Agnostic {
    public static void main(String[] args) {
        long i = 0;
        double sum = 0;
        while (true){
            i++;
            int num1 = ThreadLocalRandom.current().nextInt(0, 1000000 + 1);
            sum += num1;
            if(i%10000 == 0) {
                System.out.println(sum / i);
                System.out.println("i-->" + i/1000);
            }
        }
    }
}
