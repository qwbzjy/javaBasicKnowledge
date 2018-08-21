package com.generic;

import java.util.ArrayList;
import java.util.List;

public class WildCardWithLoweroundExample {
    static void processElements(List<? super Integer> a){
        for(Object element : a){
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
//        processElements(a2);
    }
}
