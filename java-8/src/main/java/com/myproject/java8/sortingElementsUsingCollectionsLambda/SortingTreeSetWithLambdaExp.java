package com.myproject.java8.sortingElementsUsingCollectionsLambda;

import java.util.TreeSet;

public class SortingTreeSetWithLambdaExp  {
    public static void main(String[] args) {
        //If we want ascending order
        /* TreeSet<Integer> t = new TreeSet<>(); */

        //If we want descending order
        TreeSet<Integer> t = new TreeSet<>(
                (i1,i2)-> (i1>i2)? -1: (i1<i2)?1 : 0);
    t.add(10);
    t.add(2);
    t.add(15);
    t.add(20);
    t.add(12);
    t.add(8);

        System.out.println("set of numbers are "+ t);
    }
}
