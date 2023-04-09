package com.myproject.java8.twoArugument_BiFunctionalInterface;

import java.util.function.BiFunction;

class Employee {
    int eno;
    String name;
    double dailyWage;
    Employee(int eno, String name, double dailyWage){
        this.eno=eno;
        this.name=name;
        this.dailyWage=dailyWage;
    }
}

class Timesheets{
    int eno;
    int days;
    Timesheets(int eno, int days){
        this.eno=eno;
        this.days=days;
    }
}
public class Test4BiFunction {
    public static void main(String[] args) {
        BiFunction<Employee, Timesheets, Double> bf =(e,t)-> e.dailyWage*t.days;

        Employee e = new Employee(1, "Mahomes", 400);
        Timesheets t = new Timesheets(1, 25);

        System.out.println(bf.apply(e,t));

    }
}
