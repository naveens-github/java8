package com.myproject.java8.sortingElementsUsingCollectionsLambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee{
    int eno;
    String ename;
    Employee(int eno, String ename){
        this.eno = eno;
        this.ename = ename;
    }

    @Override
    public java.lang.String toString() {
        return eno +":" +ename;
    }
}
public class SortingOfOwnClassObjectsWithLambdaExp {
    public static void main(String[] args) {
        List<Employee> l = new ArrayList<>();
        l.add(new Employee(100, "Chintu"));
        l.add(new Employee(200, "Reddy"));
        l.add(new Employee(500, "Naveen"));
        l.add(new Employee(300, "Mahomes"));
        l.add(new Employee(400, "Tyreek"));

        Collections.sort(l, (e1, e2)->(e1.eno<e2.eno)? -1 : (e1.eno>e2.eno)? 1: 0);
        System.out.println(l);
    }
}
