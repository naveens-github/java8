package com.myproject.java8.streams;

import java.util.ArrayList;
import java.util.Comparator;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(5);
        list.add(15);
        list.add(20);
        list.add(8);
        list.add(22);
        list.add(12);
        System.out.println("Before sorting :"+list);

        //Find min value using stream().min(Comparator)
        Integer minValue = list.stream().min(Comparator.naturalOrder()).get();
        System.out.println("minimum value is: "+minValue);

        //Find the max value using stream().max(Comparator)
        Integer maxValue = list.stream().max(Comparator.naturalOrder()).get();
        System.out.println("maximum value is: "+maxValue);
    }
}
