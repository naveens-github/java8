package com.myproject.java8.methodAndConstructorReference;

interface Interf{
    public void m1();
}
public class Test1 {
    public static void m2(){
        System.out.println("Method reference body ");
    }
    public static void main(String[] args) {
        Interf i =Test1::m2;
        i.m1();
    }
}
