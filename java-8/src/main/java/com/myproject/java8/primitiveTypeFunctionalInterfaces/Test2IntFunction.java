package com.myproject.java8.primitiveTypeFunctionalInterfaces;

import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToIntFunction;

public class Test2IntFunction {
    //IntFunction
//    public static void main(String[] args) {
//        IntFunction<Integer> f = i->i*i;
//        System.out.println(f.apply(5));
//    }
    //ToIntFunction:
//public static void main(String[] args) {
//    ToIntFunction<String> f =s ->s.length();
//    System.out.println(f.applyAsInt("Mahomes"));
//}

    //IntToDoubleFunction:
    public static void main(String[] args) {
        IntToDoubleFunction f = i->Math.sqrt(i);
        System.out.println(f.applyAsDouble(5));
    }


}


