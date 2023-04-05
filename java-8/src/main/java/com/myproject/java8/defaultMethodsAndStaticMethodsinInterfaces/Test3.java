package com.myproject.java8.defaultMethodsAndStaticMethodsinInterfaces;

public class Test3 implements Interf3{
    public static void main(String[] args) {
        Interf3.m3();

        //We cannot invoke the methods directly or with object. We must invoke static methods in Interface through the interface itself
        /*m3();
          Test3 test3 = new Test3();
          test3.m3()*/
    }
}
