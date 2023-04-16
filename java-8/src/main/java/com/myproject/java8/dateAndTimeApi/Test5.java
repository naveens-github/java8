package com.myproject.java8.dateAndTimeApi;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Test5 {
    public static void main(String[] args) {
        ZoneId zone = ZoneId.systemDefault();
        System.out.println(zone);

        ZoneId ist = ZoneId.of("America/Los_Angeles");
        ZonedDateTime dt = ZonedDateTime.now(ist);
        System.out.println(dt);
    }
}
