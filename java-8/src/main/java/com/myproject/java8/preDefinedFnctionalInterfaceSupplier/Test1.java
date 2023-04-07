//Write a program to get a system date by using Supplier.

package com.myproject.java8.preDefinedFnctionalInterfaceSupplier;

import java.util.Date;
import java.util.function.Supplier;

public class Test1 {
    public static void main(String[] args) {
        Supplier<Date> s = ()-> new Date();
        System.out.println(s.get());
    }
}
