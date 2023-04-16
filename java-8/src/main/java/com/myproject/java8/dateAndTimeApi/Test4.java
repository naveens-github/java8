package com.myproject.java8.dateAndTimeApi;

import java.sql.SQLOutput;
import java.time.Year;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        Year y = Year.of(n);

        //check the year is leap or not
        if(y.isLeap())
            System.out.printf("given number %d is leap year ",n);
        else
            System.out.printf("given number %d is not a leap year ",n);

    }
}
