package com.myproject.java8.dateAndTimeApi;

import java.time.LocalDate;
import java.time.Period;

public class Test3 {
    public static void main(String[] args) {
        LocalDate bithday = LocalDate.of(1997, 9, 20);
        LocalDate todaysDate = LocalDate.now();

        Period p = Period.between(bithday, todaysDate);
        System.out.printf("Age of the person: years %d months %d days %d ",p.getYears(), p.getMonths(), p.getDays() );

        //Number of days left from todays date.
        LocalDate deathDate= LocalDate.of(1997+80, 9, 20);
        Period p1 = Period.between(todaysDate, deathDate);
        int numberOfDays= p1.getYears()*365+p1.getMonths()*30+p1.getDays();
        System.out.printf("\n number of days left %d",numberOfDays );
    }
}
