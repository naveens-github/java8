//Write a Supplier function to supply 6-digit random OPT

package com.myproject.java8.preDefinedFnctionalInterfaceSupplier;

import java.util.function.Supplier;

public class Test3 {
    public static void main(String[] args) {
        Supplier<String> s = ()-> {
            String otp = "";
            for(int i=0; i<6; i++)
            otp = otp+(int)(Math.random()*10);
            System.out.println(otp);
            return otp;
        };
        s.get();
    }
}
