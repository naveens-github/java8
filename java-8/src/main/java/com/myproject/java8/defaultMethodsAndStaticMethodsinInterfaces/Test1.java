package com.myproject.java8.defaultMethodsAndStaticMethodsinInterfaces;

//we can invoke method from interface
/*
public class Test1 implements Interf1{
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.m1();
    }
} */


//we can override the default method too
public class Test1 implements Interf1{
    public void m1(){
        System.out.println("my own implementation method");
    }
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.m1();
    }
}