//Program to get random password by using Supplier
/*Rules
1. Length should be 8 characters
2. 2,4,6,8 places should be digits
3. 1,3,5,7 places should be alphabets and @, $, #
*/


package com.myproject.java8.preDefinedFnctionalInterfaceSupplier;

import java.util.function.Supplier;

public class Test4 {
    public static void main(String[] args) {
        Supplier<String> s =()-> {
            String password = "";

        Supplier<Integer> digit = ()->(int)(Math.random()*10);
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$";
        Supplier<Character> c = ()->alpha.charAt((int)(Math.random()*29));
        for(int i=1; i<=8; i++){
            if(i%2==0)
                password =password +digit.get();
            else
                password=password + c.get();
        }
            return password;
        };
        System.out.println(s.get());
    }
}
