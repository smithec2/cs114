package com.ereinsure;

import java.util.*;
import java.util.function.Consumer;

/**
 *
 */
public class Loops {
    public static void main(String[] args) {

        //while (brake)
        //      int count = 0;   // count how many divisions we've done
        boolean sentinelValue = true;
        while(sentinelValue)
        {
            sentinelValue = false;
            System.out.println("We are in a while loop");
        }

        //for (start at 10 to 20), (i+=2), (count backwards)
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }


        List<String> list = Arrays.asList("Craig","Lisa","Scott", "Kip", "Joe");

        // for each
        for (String name: list)
        {
            System.out.println(name);
        }

        // forEach
        list.forEach(System.out::println);

    }
}
