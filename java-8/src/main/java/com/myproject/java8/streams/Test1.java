package com.myproject.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(20);
        list.add(25);
        list.add(30);
        list.add(35);
        list.add(45);
        //stream().filter()
        List<Integer> l1= list.stream().filter(i->i%2==0).collect(Collectors.toList());
        //stream().map()
        List<Integer> l2 = list.stream().map(i->i*2).collect(Collectors.toList());
        System.out.println(l1);
        System.out.println(l2);
    }
}
