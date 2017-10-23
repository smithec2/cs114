package edu.ldsbc;

public class Assignment6b {
    /**
     * @author Craig Smith
     * Package Name: chapter6
     * Objective: Methods
     * Import: java.util.scanner
     * Read the instructions carefully.  Make sure you are outputting things as per the example.
     * Remember to comment your code more as explained in class.
     * <p>
     * Write a method that receives as parameters three numbers.  Return the largest number.
     * Name the method “maxNum”.
     * Example:
     * <p>
     * Enter three numbers: 23 65 2
     * Largest number is 65
     */


    public static void main(String[] args) {

        System.out.println(findLargest(1, 3, 2));

    }

    private static int findLargest(int a, int b, int c) {
        int largestNum = findLargest(a, b);
        largestNum = findLargest(largestNum, c);
        return largestNum;
    }

    private static int findLargest(int a, int b) {
        int retValue;
        if (a > b) {
            retValue = a;
        } else {
            retValue = b;
        }
        //ternary operator
        //retValue = (a < b) ? a : b;

        return retValue;
    }
}
