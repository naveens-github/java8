package com.myproject.java8.defaultMethodsAndStaticMethodsinInterfaces;

public interface Interf1 {
    default void m1(){
        System.out.println("Inside default method");
    }
}
