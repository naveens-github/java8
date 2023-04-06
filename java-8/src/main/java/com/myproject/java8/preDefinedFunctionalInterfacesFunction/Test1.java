package com.myproject.java8.preDefinedFunctionalInterfacesFunction;

import java.util.function.Function;

public class Test1 {
    public static void main(String[] args) {
        //If we pass String as INPUT and Integer as RETURN TYPE
        Function<String, Integer> f = s->s.length();
        System.out.println(f.apply("Mahomes"));

        //If we pass Integer as INPUT and Integer as RETURN TYPE, square of a number.
        Function<Integer, Integer> f1 = i->i*i;
        System.out.println(f1.apply(5));

        //If we want to remove all spaces between the words
        String company= "Epam  Systems Inc";
        Function<String, String> f2 = s ->s.replaceAll(" ", "");
        System.out.println(f2.apply(company));

        //Find number of spaces in the string
        String companyName= "Epam  Systems Inc   pittsburg";
        Function<String, Integer> f3 = s -> s.length()-s.replaceAll(" ", "").length();
        System.out.println(f3.apply(companyName));
    }
}
