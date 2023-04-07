package com.myproject.java8.preDefinedFunctionalInterfaceConsumer;

import java.util.function.Consumer;

public class Test1 {
    public static void main(String[] args) {
        Consumer<String> c = s -> System.out.println(s);
        c.accept("Hello");
        c.accept("Welcome Home");
    }
}
