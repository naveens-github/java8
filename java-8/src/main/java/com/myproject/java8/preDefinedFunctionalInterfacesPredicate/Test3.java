package com.myproject.java8.preDefinedFunctionalInterfacesPredicate;

import java.util.function.Predicate;
//Program to display names start with 'K' by using predicate
public class Test3 {
    public static void main(String[] args) {
        String[] names = {"Aishwarya", "Kajal", "Sunny", "Katrina", "Kareena"};
        Predicate<String> p =s->s.startsWith("K");
        //Predicate<String> p =s->s.charAt(0)=='K';    //we can use this line as well instead of above.
        for(String name: names){
            if(p.test(name)){
                System.out.println(name);
            }
        }
    }
}
