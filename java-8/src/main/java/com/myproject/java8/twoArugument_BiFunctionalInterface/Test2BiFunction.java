package com.myproject.java8.twoArugument_BiFunctionalInterface;

import java.util.function.BiFunction;

public class Test2BiFunction {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> bf = (a,b)-> a*b;
        System.out.println(bf.apply(10, 20));
        System.out.println(bf.apply(20, 30));

    }
}
