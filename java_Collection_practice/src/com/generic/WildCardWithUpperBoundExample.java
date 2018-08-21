package com.generic;

import java.util.ArrayList;
import java.util.List;

public class WildCardWithUpperBoundExample {
    static void processElements(List<? extends Number> a){
        for(Object element:a){
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        List<Integer> a1 = new ArrayList<>();
        a1.add(10);
        a1.add(20);
        a1.add(30);
        processElements(a1);

        List<Long> a2 = new ArrayList<>();
        a2.add(100L);
        a2.add(200L);
        a2.add(300L);
        processElements(a2);

        List<Double> a3 = new ArrayList<>();
        a3.add(21.35);
        a3.add(56.47);
        a3.add(78.12);
        processElements(a3);

        List<String> a4 = new ArrayList<>();
        a4.add("one");
        a4.add("two");
        a4.add("three");
//        processElements(a4);
    }
}
