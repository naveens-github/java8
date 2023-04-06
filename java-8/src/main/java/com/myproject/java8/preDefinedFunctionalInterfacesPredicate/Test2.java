package com.myproject.java8.preDefinedFunctionalInterfacesPredicate;

import java.util.function.Predicate;

public class Test2 {
    public static void main(String[] args) {
        int[] x = {1, 2, 5, 10, 20, 35, 44};
        Predicate<Integer> p1 = i -> i > 10;
        Predicate<Integer> p2 = i -> i % 2 == 0;
        System.out.println("numbers greater than 10");
        m1(p1, x);
        System.out.println("number not greater than 10");
        m1(p1.negate(),x);
        System.out.println("number that are even");
        m1(p2, x);
        System.out.println("numbers greater than 10 and even");
        m1(p1.and(p2),x);
    }

    public static void m1(Predicate<Integer> p, int[] x){
        for (int x1:x){
            if(p.test(x1))
                System.out.println(x1);
        }
    }
}
