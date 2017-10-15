package edu.ldsbc;

import java.util.concurrent.ThreadLocalRandom;

public class Assignment6a {
    /**
     * CS 114 - Assignment 6a
     * Package Name: chapter6
     * Objective: Methods
     * Import: java.util.scanner
     * <p>
     * <p>
     * Write a method named isDivisible that takes two integers,
     * n and m, and that returns true if n is divisible by m, and false otherwise.
     * <p>
     * Example:
     * <p>
     * Enter n, m: 7 8
     * false
     * <p>
     * Enter n,m: 22 11
     * true
     */


    public static void main(String[] args) {
        int m = 10;
        int n = 20;

        boolean result = isDivisible(m, n);
        System.out.println(result);
    }

    private static boolean isDivisible(int m, int n) {
        return n % m == 0;
    }
}
