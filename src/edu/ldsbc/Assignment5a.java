package edu.ldsbc;


import java.util.concurrent.ThreadLocalRandom;

public class Assignment5a {
    /**
     * @auth Craig Smith
     * @date 10/9/2017
     * CS 114 - Assignment 5a
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

        //get 4 random numbers
        int num1 = ThreadLocalRandom.current().nextInt(0, 100 + 1);
        int num2 = ThreadLocalRandom.current().nextInt(0, 100 + 1);
        int num3 = ThreadLocalRandom.current().nextInt(0, 100 + 1);
        int num4 = ThreadLocalRandom.current().nextInt(0, 100 + 1);
        //display number to user
        //System.out.println(num1 "  + " +  num2 + " + " ;);
        //get user input
        //check input
        //test if input is crrect

        //int num1 = 1;
        //int randNum = ThreadLocalRandom.current().nextInt(0, 100 + 1);
        // System.out.println(randNum);
        }

}
