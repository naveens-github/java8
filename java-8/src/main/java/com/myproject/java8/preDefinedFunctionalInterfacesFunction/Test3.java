//Program to find total monthly salary of all employees by using Function.

package com.myproject.java8.preDefinedFunctionalInterfacesFunction;

import java.util.ArrayList;
import java.util.function.Function;

class Employee{
    String name;
    double salary;
    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    public String toString(){
        return name+":"+salary;
    }
}

public class Test3 {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        populate(list);
        Function<ArrayList<Employee>, Double> f1 = l-> {
            double total = 0;
            for(Employee e1: l)
            total = total + e1.salary;
            return total;
        };
        System.out.println("total salary is: "+f1.apply(list));
    }
    public static void populate(ArrayList<Employee> list){
        list.add(new Employee("Mahomes", 12000));
        list.add(new Employee("Tyreek", 5000));
        list.add(new Employee("Kelce", 11000));
        list.add(new Employee("Chris", 7000));
        list.add(new Employee("Micheal", 3500));

    }
}
