package edu.ldsbc;

public class Recursion {
    /**

     A simple base case which we have a solution for and a return value.
     A way of getting our problem closer to the base case. I.e. a way to chop out part of the problem to get a somewhat simpler problem.
     A recursive call which passes the simpler problem back into the method.
     */


    public static void main(String[] args) {

        System.out.println(factorial(4));
    }

    private static int factorial  (int n) {
       if(n > 1)
       {
          return n * factorial(n-1);
       }
       else {
           return n;
       }

    }


}
