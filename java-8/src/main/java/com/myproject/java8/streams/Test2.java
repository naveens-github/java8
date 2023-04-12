package com.myproject.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String>  list = new ArrayList<>();
        list.add("Mahomes");
        list.add("Patrick");
        list.add("Tyreek");
        list.add("Hill");
        list.add("Kelce");

        //To filter
        List<String> arrayList = list.stream().filter(s->s.length()>5).collect(Collectors.toList());
        System.out.println(arrayList);

        //To map
        List<String> al = list.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
        System.out.println(al);

        //To get the number of string that have size >=5
        Long count= list.stream().filter(s->s.length()>=5).count();
        System.out.println("Number of elements that have size greater than 5 is: "+count);
    }
}
