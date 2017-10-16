package edu.ldsbc;

import java.util.concurrent.ThreadLocalRandom;

public class Assignment5b {
    /**
     * @author Craig Smith
     * 10/7/2017
     * CS 114 - Assignment 5b
     * Package Name: chapter5
     * Objective: If Statements, Formatting Output
     * Import: java.util.scanner
     * <p>
     * Write a program that prompts the user to enter an amount of money. Then output a listing of the number of dollars, quarters, dimes, nickels, and pennies that make up that amount.
     * <p>
     * Examples:
     * <p>
     * Enter an amount: 1.41
     * <p>
     * 1	dollar
     * 1	quarter
     * 1	dime
     * 1	nickel
     * 1	penny
     * <p>
     * Enter an amount: 5.58
     * <p>
     * 5	dollars
     * 2	quarters
     * 1	nickel
     * 3	pennies
     * <p>
     * Notes:
     * 1.	Don’t display a denomination if there aren’t any of them.
     * <p>
     * 2.	Display singular words for single units (1 dollar, 1 penny, etc.) and display plural words for more than one unit (2 quarters, 3 pennies, etc.)
     */

    public static void main(String[] args) {

        float money = 1.41f;
        int moneyInCents = (int) (money * 100);
        int dollars = (int) moneyInCents/100; //bug here
        moneyInCents = moneyInCents - dollars * 100;
        int quarters = moneyInCents/25;
        moneyInCents = moneyInCents - quarters * 25;
        int dime = moneyInCents/10;
        moneyInCents = moneyInCents - dime * 10;
        int nickel = moneyInCents/5;
        moneyInCents = moneyInCents - nickel * 5;
        //pennies
        int pennies = moneyInCents;
    }
}
