package com.myproject.java8.preDefinedFunctionalInterfaceConsumer;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student{
    String name;
    int marks;
    Student(String name, int marks){
        this.name=name;
        this.marks=marks;
    }
}

public class Test3 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        populate(list);
        Predicate<Student> p = s->s.marks>60;
        Function<Student, String> f1 = s -> {
            int marks = s.marks;
            if (marks >= 80) {
                return "A[Distinction]";
            } else if (marks >= 60) {
                return "B[First class]";
            } else if (marks >= 50) {
                return "C[Second class]";
            } else if (marks >= 35) {
                return "D[Third class]";
            } else {
                return "E[Failed]";
            }
        };
        Consumer<Student> c = s->{
            System.out.println("Name of the student: "+ s.name);
            System.out.println("Grade of the Studets: "+f1.apply(s));
            System.out.println();
        };
        for(Student s : list){
            if(p.test(s))
                c.accept(s);
        }
    }
    public static void populate(ArrayList<Student> list){
        list.add(new Student("Mahomes", 100));
        list.add(new Student("Kelce", 87));
        list.add(new Student("Tyreek", 10));
        list.add(new Student("Jones", 95));
        list.add(new Student("clark", 55));
    }
}
