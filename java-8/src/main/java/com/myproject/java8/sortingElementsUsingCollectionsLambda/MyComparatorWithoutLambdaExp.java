package com.myproject.java8.sortingElementsUsingCollectionsLambda;

import java.util.Comparator;

public class MyComparatorWithoutLambdaExp implements Comparator<Integer> {

    @Override
    public int compare(Integer i1, Integer i2) {
        /* if(i1>i2){
            return -1;
        } else if(i1<i2){
            return +1;
        }
        else{
            return 0;
        } */

        //Using ternary operator
        return (i1>i2)? -1 : (i1<i2)? +1 : 0;
    }
}
