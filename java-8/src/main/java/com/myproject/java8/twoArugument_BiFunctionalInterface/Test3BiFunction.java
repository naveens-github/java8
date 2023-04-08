//To create student object by taking name and roll no. as input by using BiFunction

package com.myproject.java8.twoArugument_BiFunctionalInterface;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.ArrayList;
import java.util.function.BiFunction;

class Student{
    String name;
    int rollno;
    Student(String name, int rollno){
        this.name=name;
        this.rollno=rollno;
    }
}

public class Test3BiFunction {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        BiFunction<String, Integer, Student> bf = (name, rollno)->new Student(name, rollno);
        list.add(bf.apply("Mahomes", 15));
        list.add(bf.apply("Tyreek", 10));

        for(Student s: list){
            System.out.println("name "+s.name);
            System.out.println("roll no "+s.rollno);
        }

    }
}
