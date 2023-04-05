package com.myproject.java8.preDefinedFunctionalInterfacesPredicate;

import java.util.function.Predicate;

public class Test1 {
    public static void main(String[] args) {
        //Using Integer
        /*Predicate<Integer> p = i -> i>10;
        System.out.println(p.test(100));    //true
        System.out.println(p.test(5));*/    //false

        //Using String
        Predicate<String> p = s -> s.contains("a");
        System.out.println(p.test("Naveen"));    //true
        System.out.println("NAVEEN");              //false
    }
}
