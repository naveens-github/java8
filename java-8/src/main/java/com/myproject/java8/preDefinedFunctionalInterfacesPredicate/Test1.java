package com.myproject.java8.preDefinedFunctionalInterfacesPredicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class Test1 {
    public static void main(String[] args) {
        //Using Integer
        /*Predicate<Integer> p = i -> i>10;
        System.out.println(p.test(100));    //true
        System.out.println(p.test(5));*/    //false

        //Using String
        /*Predicate<String> p = s -> s.contains("a");
        System.out.println(p.test("Naveen"));    //true
        System.out.println("NAVEEN");              //false */

        //check whether the given collection is empty or not
        Predicate<Collection> p = c->c.isEmpty();
        List<String> list1= new ArrayList<>();
        list1.add("mahomes");
        System.out.println(p.test(list1));   //false

        List<String> list2= new ArrayList<>();
        System.out.println(p.test(list2));   //true

    }
}
