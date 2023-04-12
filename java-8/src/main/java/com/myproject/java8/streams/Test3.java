package com.myproject.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(10);
        list.add(15);
        list.add(5);
        list.add(25);
        list.add(18);
        list.add(30);
        System.out.println("Before sorting:+ "+list);

        //sorted()
        List<Integer> l1 = list.stream().sorted().collect(Collectors.toList());
        System.out.println("Normal order: "+l1);

        //sorted(Comparator)
        List<Integer> l2 = list.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println("Customized order: "+l2);



    }
}
