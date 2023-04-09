package com.myproject.java8.primitiveTypeFunctionalInterfaces;

import java.util.function.IntPredicate;

public class Test1IntPredicate {  //we can do same for LongPredicate as well
    public static void main(String[] args) {
        int[] x ={1, 2, 3, 10, 20, 5, 17};
        IntPredicate p =i->i%2==0;
        for(int x1 :x) {
            if(p.test(x1))
                System.out.println("even numbers are: "+x1);
        }
    }
}
