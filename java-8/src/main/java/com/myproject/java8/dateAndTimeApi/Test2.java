package com.myproject.java8.dateAndTimeApi;

import java.time.LocalDateTime;
import java.time.Month;

public class Test2 {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        int dd = dt.getDayOfMonth();
        int mm = dt.getMonthValue();
        int yyyy = dt.getYear();
        System.out.printf("%d-%d-%d",dd, mm, yyyy);

        int h = dt.getHour();
        int m = dt.getMinute();
        int s = dt.getSecond();
        int ns = dt.getNano();
        System.out.printf("\n%d:%d:%d:%d", h,m,s,ns);

        //1995, May 20. 12:45 LocalDateTime.of
        LocalDateTime dateTime= LocalDateTime.of(1995, 05, 20, 12, 45);
        LocalDateTime dateTime1= LocalDateTime.of(1995, Month.MAY, 20, 12, 45);

        System.out.println("\n"+ dateTime);
        System.out.println(dateTime1);

        //After 6 months from the above date:
        System.out.println(dateTime.plusMonths(6));
        //we can add weeks, months, years, minutes, seconds, nanoseconds
        //TODO

        //Before 6 months
        System.out.println(dateTime.minusMonths(6));


    }
}