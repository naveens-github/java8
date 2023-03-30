package com.myproject.java8.functionalinterfaceWithLambda;

public class Demo2 {
    public static void main(String[] args) {
        Interf2 i = (a,b)-> System.out.println("Sum of two numbers " + (a+b));
        i.m2(10, 20);
        i.m2(100, 200);
    }
}
