package com.myproject.java8.preDefinedFunctionalInterfacesFunction;

import java.util.ArrayList;
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

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        populate(list);
        Function<Student, String> f1 = s -> {
            int marks= s.marks;
            if (marks>=80){
                return "A[Distinction]";
            }
            else if (marks>=60){
                return "B[First class]";
            }
            else if (marks>=50){
                return "C[Second class]";
            }
            else if (marks>=35){
                return "D[Third class]";
            }
            else {
                return "E[Failed]";
            }
        };
        //if we want to get only the students whose marks are above 60
        Predicate<Student> p = s -> s.marks>60;
        for(Student s : list)
            if(p.test(s)){
                System.out.println("Student name: "+s.name);
                System.out.println("Student marks: "+s.marks);
                System.out.println("student grades: "+f1.apply(s));
                System.out.println("************   *******");
            }

        //If we want to get all the students
        for(Student s : list) {
            System.out.println("Student name: "+s.name);
            System.out.println("Student marks: "+s.marks);
            System.out.println("student grades: "+f1.apply(s));
            System.out.println("****______******_____*********");
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
