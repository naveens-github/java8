package com.myproject.java8.streams;

import java.util.ArrayList;
import java.util.List;

public class Test5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("BBB");
        list.add("CCCC");
        System.out.println(list);

        //Use forEach.
        list.stream().forEach(s-> System.out.println(s));
        //Use method reference instead of lambda expression
        list.stream().forEach(System.out::println);
    }
}
