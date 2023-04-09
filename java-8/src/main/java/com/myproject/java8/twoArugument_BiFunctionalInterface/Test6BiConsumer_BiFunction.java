//Increment Employee salary by BiFunction and BiConsumer

package com.myproject.java8.twoArugument_BiFunctionalInterface;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

class Employee1{
    String name;
    double salary;
    Employee1(String name, double salary){
        this.name=name;
        this.salary=salary;
    }
}
public class Test6BiConsumer_BiFunction {
    public static void main(String[] args) {
        ArrayList<Employee1> list = new ArrayList<>();
        BiFunction<String, Double, Employee1> bf =(n, s)->new Employee1(n, s);
        list.add(bf.apply("Mahomes", 1000.0));
        list.add(bf.apply("patrick", 1500.0));
        list.add(bf.apply("Kelce", 1200.0));
        list.add(bf.apply("Travis", 1600.0));

        BiConsumer<Employee1, Double> bc =(employee, increment)->employee.salary= employee.salary+increment;
        for(Employee1 e: list)
            bc.accept(e, 550.0);

        for(Employee1 e:list)
            System.out.println("Name of the employee: "+e.name+" "+"salary is: "+e.salary);
    }
}
