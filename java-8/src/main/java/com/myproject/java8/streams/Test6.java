package com.myproject.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

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

        //For group of values
        Stream<Integer> s = Stream.of(9,99,999,9999,99999);
        s.forEach(System.out::println);

        //For Arrays
        Double[] d ={10.0, 0.0, 3.0, 45.0, 56.0, 22.0};
        Stream<Double> s1 = Stream.of(d);
        s1.forEach(System.out::println);

    }
}
