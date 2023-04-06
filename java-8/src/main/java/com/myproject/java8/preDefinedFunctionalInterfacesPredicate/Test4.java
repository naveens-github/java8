package com.myproject.java8.preDefinedFunctionalInterfacesPredicate;

import java.util.ArrayList;
import java.util.function.Predicate;

//Predicate example to remove the null values and Empty String from the given String array
public class Test4 {
    public static void main(String[] args) {
        String[] names = {"Shiva", null, "", "Mahomes", "Tyreek", "", null};
        Predicate<String> p = s -> s != null && s.length() != 0;
        ArrayList<String> list = new ArrayList<>();
        for(String name : names)
            if(p.test(name))
                list.add(name);
        System.out.println("List that doesn't have empty and null values: "+list);
    }
}