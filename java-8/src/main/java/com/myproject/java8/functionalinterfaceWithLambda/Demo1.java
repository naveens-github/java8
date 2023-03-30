package com.myproject.java8.functionalinterfaceWithLambda;

public class Demo1 {
    public static void main(String[] args) {
        Interf1 i = ()-> System.out.println("Body of m1");
        i.m1();
    }
}
