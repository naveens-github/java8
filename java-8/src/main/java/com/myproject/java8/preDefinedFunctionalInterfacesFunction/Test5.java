package com.myproject.java8.preDefinedFunctionalInterfacesFunction;

import java.util.function.Function;

public class Test5 {
    public static void main(String[] args) {
        Function<String, String> f1 = s-> s.toUpperCase();
        Function<String, String> f2 = s-> s.substring(0,9);

        System.out.println(f1.apply("Aishwaryaabhi"));
        System.out.println(f2.apply("Aishwaryaabhi"));
        System.out.println(f1.andThen(f2).apply("Aishwaryaabhi"));
        System.out.println(f1.compose(f2).apply("Aishwaryaabhi"));


        //Check the difference of andThen, compose.
        Function<Integer, Integer> f3 = i->i+i;
        Function<Integer, Integer> f4 = i->i*i*i;
        System.out.println(f3.apply(2));
        System.out.println(f4.apply(2));
        System.out.println(f3.andThen(f4).apply(2));
        System.out.println(f3.compose(f4).apply(2));
    }
}
