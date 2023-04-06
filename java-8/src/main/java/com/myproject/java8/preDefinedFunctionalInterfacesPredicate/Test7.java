package com.myproject.java8.preDefinedFunctionalInterfacesPredicate;

import java.util.ArrayList;

class Employee{
    String name;
    String designation;
    double salary;
    String city;
    Employee(String name, String designation, double salary, String city){
        this.name= name;
        this.designation= designation;
        this.salary=salary;
        this.city=city;
    }
    public String toString(){
        String s = String.format("(%s, %s, %.2f, %s)", name, designation, salary, city);
        return s;
    }

}
public class Test7 {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        Employee e = new Employee("Tyreek", "Team lead", 30000, "Charlotte");
        Employee e2 = new Employee("Hill", "Wide receiver", 35000, "Kansas");
        list.add(e);
        list.add(e2);
        System.out.println(list);
    }
}
