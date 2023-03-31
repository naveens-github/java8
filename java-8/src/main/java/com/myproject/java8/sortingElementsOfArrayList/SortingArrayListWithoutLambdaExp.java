package com.myproject.java8.sortingElementsOfArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingArrayListWithoutLambdaExp {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(0);
        l.add(5);
        l.add(15);
        l.add(2);
        System.out.println("Before Sorting "+l);
        Collections.sort(l, new MyComparatorWithoutLambdaExp());
        System.out.println("After sorting "+l);
    }
}
