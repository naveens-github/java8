package com.myproject.java8.sortingElementsUsingCollectionsLambda;

import java.util.*;

public class SortingTreeMaptWithLambdaExp {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>((i1,i2)-> (i1>i2)? -1: (i1<i2)?1 : 0);
        map.put(1, "Aishuu");
        map.put(24, "Uzma");
        map.put(3,"Chintu");
        map.put(7, "Georgia");
        map.put(2, "Balu");

        System.out.println("Key value pairs are "+ map);
    }
}