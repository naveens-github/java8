package com.myproject.java8.streams;

import java.util.ArrayList;
import java.util.List;

public class Test6 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(10);
        list.add(15);
        list.add(5);
        list.add(25);
        list.add(18);
        list.add(30);
        System.out.println("Before Sorting: "+list);

        Integer[] array = list.stream().toArray(Integer[]::new);
        for(Integer x: array)
            System.out.println(x);
    }
}
