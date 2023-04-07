//Generate a random name by using supplier

package com.myproject.java8.preDefinedFnctionalInterfaceSupplier;

import java.util.function.Supplier;

public class Test2 {
    public static void main(String[] args) {
        Supplier<String> s =()-> {
            String[] s1 = {"Mahomes", "Tyreek", "Kelce"};
            int x = (int)(Math.random()*4);
            return s1[x];
        };
        System.out.println(s.get());
    }
}
