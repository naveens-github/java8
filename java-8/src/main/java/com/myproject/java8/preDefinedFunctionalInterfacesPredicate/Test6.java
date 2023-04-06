package com.myproject.java8.preDefinedFunctionalInterfacesPredicate;

import java.util.function.Predicate;

class SoftwareEngineer{
    String name;
    int age;
    boolean isHavingGF;
    SoftwareEngineer(String name, int age, boolean isHavingGF){
        this.name=name;
        this.age=age;
        this.isHavingGF= isHavingGF;
    }
    public String toString(){
        return name;
    }
}

public class Test6 {
    public static void main(String[] args) {
        SoftwareEngineer[] listOfSE = {
                new SoftwareEngineer("Mahomes", 26, true),
                new SoftwareEngineer("Tyreek", 10, false),
                new SoftwareEngineer("cylide", 44, true),
                new SoftwareEngineer("Brady", 39, true),
                new SoftwareEngineer("Tom", 12, false),
        };
        Predicate<SoftwareEngineer> p = se -> se.age >=18 && se.isHavingGF==true;
        for(SoftwareEngineer se:listOfSE)
            if(p.test(se))
                System.out.println("He is eligible to go to pub  "+se);
    }
}
