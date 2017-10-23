package edu.ldsbc;

public class Demo6 {
    /**
     * @author Craig Smith
     * 10/14/2017
     * f1
     * f2
     * times table
     * <p>
     * //ternary operator
     * //retValue = (a < b) ? a : b;
     */

    public static void main(String[] args) {

        int a =0, b =3;
        int biggest;
        if( a > b){
            biggest = a;
        }
        else
        {
            biggest = b;
        }

        biggest = (a > b) ? a : b;

        System.out.println(timesTwoValues(3, 2));
        System.out.println(timesTwoValues(3, 3));
        System.out.println(timesTwoValues(3, 4));
        System.out.println(timesTwoValues(3, 5));
        System.out.println(timesTwoValues(3, 6));
        System.out.println(timesTwoValues(3, 7));
        System.out.println(timesTwoValues(3, 8));

    }

    private static int timesTwoValues(int val1, int val2) {
        return val1 * val2;
    }

    private static void f1() {
        System.out.println("in f1");
    }


}
