package com.ereinsure;

import java.util.*;
import java.util.function.Consumer;

public class Customer {
    public static void main(String[] args) {

        List<String> result = new ArrayList<>();

        Comparator<String> comparable = (String s1, String s2) ->
          Integer.compare(s1.length(), s2.length());

        List<String> list = Arrays.asList("**","*","*****");
        Collections.sort(list, comparable);
        list.forEach(System.out::println);

        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = result::add;
        list.forEach(c1.andThen(c2));
        System.out.println(result.size());
    }
}
