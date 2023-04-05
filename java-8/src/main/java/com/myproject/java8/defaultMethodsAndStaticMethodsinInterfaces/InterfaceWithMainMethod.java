package com.myproject.java8.defaultMethodsAndStaticMethodsinInterfaces;

public interface InterfaceWithMainMethod {

    //We can run our main method from interface too from Java 1.8 onwards
    static void main(String[] args) {
            System.out.println(" calling main method from interface ");
    }
}
