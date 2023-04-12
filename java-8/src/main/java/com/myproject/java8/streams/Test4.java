package com.myproject.java8.streams;

import java.util.ArrayList;
import java.util.List;

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

        Integer minValue = list.stream().min((i1,i2)->i1.compareTo(i2)).get();
        System.out.println("minimum value is: "+minValue);
    }
}
