package com.myproject.java8.functionalinterfaceWithLambda;

public class Demo3 {
    public static void main(String[] args) {
        Interf3 i = s -> s.length();
        System.out.println(i.getLength("Naveen"));
        System.out.println(i.getLength("Naveen    "));//Count spaces too
    }
}
