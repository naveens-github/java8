package com.myproject.java8.functionalinterfaceWithLambda;

public class Demo4 {
    public static void main(String[] args) {
        Interf4 i =a -> a*a;
        System.out.println(i.squareIt(5));
        System.out.println(i.squareIt(10));

    }
}
