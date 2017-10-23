package com.ereinsure;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Compair {
    public static void main(String[] args) {

        Comparator<String> comparable = (String s1, String s2) ->
          Integer.compare(s1.length(), s2.length());

        List<String> list = Arrays.asList("**","*","*****");
        Collections.sort(list, comparable);
        for (String str:list)
            System.out.println(str);

    }
}
