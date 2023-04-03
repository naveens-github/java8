package com.myproject.java8.defaultMethodsAndStaticMethodsinInterfaces;

public class Test2 implements LeftInterf, RightInterf {
    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.m1();
    }
    public void m1(){
        //System.out.println("my own implementation");

        ////we can invoke any of the interface either left/right
        //LeftInterf.super.m1();
        RightInterf.super.m1();
    }
}
