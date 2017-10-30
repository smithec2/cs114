package com.ereinsure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdaBoost {
    public List<List> create() {
        List x0 = Arrays.asList(1, 1, 0, 1, 0);
        List x1 = Arrays.asList(1, 1, 0, 1, 0);
        List x2 = Arrays.asList(1, 1, 0, 1, 0);
        List x3 = Arrays.asList(1, 1, 0, 1, 0);
        List x4 = Arrays.asList(1, 1, 0, 1, 0);

        List y = new ArrayList();
        y.add(x0);
        y.add(x1);
        y.add(x2);
        y.add(x3);
        y.add(x4);
        return y;
    }

    public void print(List<List> y) {

        for (List list: y)
        {
            list.forEach(System.out::println);
            System.out.println(list);
        }

    }

    //make guess
    // evaluate
    // save result
}
