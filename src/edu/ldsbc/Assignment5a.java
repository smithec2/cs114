package edu.ldsbc;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Assignment5a {
    /**
     * @auth CS 114 - Assignment 5a
     * Package Name: chapter5
     * Objective: Random Numbers, If Statements
     * Import: java.util.scanner, java.util.random
     * <p>
     * <p>
     * Generate 4 random numbers and prompt the user to add them together. Then tell the user if they were correct.
     * <p>
     * Note: In order to create a random number you’ll need to create a random number generator object. This is done like this:
     * <p>
     * Random rndNum = new Random();
     * <p>
     * You can then generate random numbers with it like this:
     * <p>
     * num1 = rndNum.nextInt();
     * <p>
     * Example:
     * <p>
     * What is 6+2+8+1? 16
     * 6+2+8+1=16 is false
     * <p>
     * What is 1+8+5+9? 23
     * 1+8+5+9=23 is true
     */


    // why are random number important?
    public static void main(String[] args) {

        while (true) {
            int randNum = ThreadLocalRandom.current().nextInt(0, 100 + 1);
            System.out.println(randNum);
        }
    }
}
