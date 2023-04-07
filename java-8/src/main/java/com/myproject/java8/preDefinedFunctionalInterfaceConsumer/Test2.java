//Program to display movie information by using consumer
package com.myproject.java8.preDefinedFunctionalInterfaceConsumer;

import java.util.ArrayList;
import java.util.function.Consumer;

class Movie{
    String name;
    String hero;
    String heroine;
    Movie(String name, String hero, String heroine){
        this.name = name;
        this.hero = hero;
        this.heroine= heroine;
    }
    public String toString(){
        return name+" : "+hero+" : "+heroine;
    }

}

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Movie> list = new ArrayList<>();
        populate(list);
        Consumer<Movie> c = m-> {
            System.out.println("Movie Details: "+m);
            System.out.println("Movie name: "+m.name);
            System.out.println("Hero name: "+m.hero);
            System.out.println("Heroine name : "+m.heroine);
        };
        for(Movie m:list)
        c.accept(m);
    }
    public static void populate(ArrayList<Movie> list){
        list.add(new Movie("Bhanubali", "Prabhas", "Anushka"));
        list.add(new Movie("Balagam", "komurayya", "kalyani"));
    }
}
