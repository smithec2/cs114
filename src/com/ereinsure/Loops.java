package com.ereinsure;

import java.util.*;
import java.util.function.Consumer;

public class Loops {
    public static void main(String[] args) {

        //while
        boolean sentnalValue = true;
        while(sentnalValue)
        {

        }

        //for
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
