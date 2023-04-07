package com.myproject.java8.preDefinedFunctionalInterfaceConsumer;

import java.util.function.Consumer;

class Movie1{
    String name;
    String result;
    Movie1(String name, String result){
        this.result=result;
        this.name = name;
    }
}
public class Test4 {
    public static void main(String[] args) {
        Consumer<Movie1> c1 = m-> System.out.println("Movie name: "+m.name+", "+"and first object result is: "+m.result);

        Consumer<Movie1> c2 = m-> System.out.println("Movie name: "+m.name+", "+"and second object result is: "+m.result);

        Consumer<Movie1> c3 = m->  System.out.println("Movie name: "+m.name+", "+"and third object result is: "+m.result);

        Consumer<Movie1> chainedC = c1.andThen(c2).andThen(c3);
        Movie1 m = new Movie1("Balagam", "hit");
        chainedC.accept(m);

    }
}
