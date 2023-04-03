package com.myproject.java8.defaultMethodsAndStaticMethodsinInterfaces;

public interface LeftInterf {
    default void m1(){
        System.out.println("Left interface body");
    }
}
