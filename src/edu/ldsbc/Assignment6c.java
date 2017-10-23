package edu.ldsbc;

public class Assignment6c {
    /**
     Package Name: chapter6
     Objective: Methods, Recursion
     Import: java.util.scanner
     Read the instructions carefully.  Make sure you are outputting things as per the example.
     Remember to comment your code more as explained in class.

     Write a recursive method called power that takes a double x and an integer n and returns xn.
     Hint: A recursive definition of this operation is xn = x * xn-1. Also, remember that anything raised to the zeroth power is 1.
     Example:

     Enter x and n: 4.5  3
     91.125

     */


    public static void main(String[] args) {

        System.out.println(powerFinder(3,2));
        System.out.println(powerFinder(4.5,3));
    }

    private static double powerFinder(double x, int n) {
        if(n > 1){
            n--;
           return x * powerFinder(x, (n--));
        }

        return x;
    }
}
