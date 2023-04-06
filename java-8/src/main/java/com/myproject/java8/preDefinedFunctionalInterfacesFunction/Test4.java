package com.myproject.java8.preDefinedFunctionalInterfacesFunction;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee2{
    String name;
    double salary;
    Employee2(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    public String toString(){
        return name+":"+salary;
    }
}

public class Test4 {
    public static void main(String[] args) {
        ArrayList<Employee2> list = new ArrayList<>();
        populate(list);
        System.out.println(" Before increment the salary: "+ list);
        Predicate<Employee2> p = e->e.salary>7000;
        Function<Employee2, Employee2> f = e1-> {
            e1.salary= e1.salary+477;
            return e1;
        };
        ArrayList<Employee2> list2 = new ArrayList<>();
        for(Employee2 e : list)
        if (p.test(e)){
            f.apply(e);
            list2.add(e);

        }

        System.out.println("After increment the salary"+ list);
        System.out.println("Only increment salaries:  "+list2);
    }
    public static void populate(ArrayList<Employee2> list){
        list.add(new Employee2("Mahomes", 12000));
        list.add(new Employee2("Tyreek", 5000));
        list.add(new Employee2("Kelce", 11000));
        list.add(new Employee2("Chris", 7000));
        list.add(new Employee2("Micheal", 3500));

    }
}