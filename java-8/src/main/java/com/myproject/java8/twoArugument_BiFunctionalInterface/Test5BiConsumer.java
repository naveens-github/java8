package com.myproject.java8.twoArugument_BiFunctionalInterface;

import java.util.function.BiConsumer;

public class Test5BiConsumer {
    public static void main(String[] args) {
        BiConsumer<String, String> bc =(s1, s2)-> System.out.println(s1+s2);
        bc.accept("Mahomes", "Patrick");
    }
}
