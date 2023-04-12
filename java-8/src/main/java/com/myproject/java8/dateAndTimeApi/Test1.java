package com.myproject.java8.dateAndTimeApi;

import java.time.LocalDate;
import java.time.LocalTime;

public class Test1 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println( date);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        //if we want to print the date in our own style
        int dd =date.getDayOfMonth();
        int mm = date.getMonthValue();
        int yyyy = date.getYear();
        System.out.println(dd+"..."+mm+"..."+yyyy);
        System.out.printf("%d-%d-%d", dd, mm, yyyy);
        System.out.println();

        //if we want to print the time in our own style[h:m:s:n]
        int h=time.getHour();
        int m=time.getMinute();
        int s= time.getSecond();
        int n= time.getNano();
        System.out.printf("%d:%d:%d:%d", h,m,s,n);
    }
}
