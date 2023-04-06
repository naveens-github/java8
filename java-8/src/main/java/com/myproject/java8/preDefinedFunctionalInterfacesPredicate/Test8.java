package com.myproject.java8.preDefinedFunctionalInterfacesPredicate;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee2{
    String name;
    String designation;
    double salary;
    String city;
    Employee2(String name, String designation, double salary, String city){
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
public class Test8 {
    public static void main(String[] args) {
        ArrayList<Employee2> list = new ArrayList<>();
        populate(list);
        Predicate<Employee2> p = emp -> emp.designation.equals("QB");
        display(p, list);

    }
    public static void populate (ArrayList<Employee2> list){
        list.add(new Employee2("Mahomes", "QB", 1500, "Kansas"));
        list.add(new Employee2("Tom", "QB", 1200, "Florida"));
        list.add(new Employee2("Russell", "QB", 1100, "seattle"));
        list.add(new Employee2("Tyreek", "WR", 900, "Kansas"));
        list.add(new Employee2("Evans", "WR", 800, "Florida"));
        list.add(new Employee2("Adams", "WR", 500, "wisconsin"));
        list.add(new Employee2("Kelce", "TE", 1400, "Kansas"));
    }
    public static void display(Predicate<Employee2> p,ArrayList<Employee2> list ){
        for(Employee2 emp :list)
            if(p.test(emp))
        System.out.println(emp);
    }
}
