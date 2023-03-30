package com.myproject.java8.functionalinterfaceWrtInheritance;

@FunctionalInterface
public interface Interf {
    public void m1();
    default void m2(){
    }
    public static void m3(){
    }
}
/* we can have mutiple default and static methods but Functional Interface should have only one abstract
method */