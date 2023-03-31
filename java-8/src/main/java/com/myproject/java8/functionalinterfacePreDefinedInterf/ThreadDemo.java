package com.myproject.java8.functionalinterfacePreDefinedInterf;

public class ThreadDemo {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i=1; i<=10; i++)
                System.out.println("run method body in child thread");
        };
        Thread thread = new Thread(runnable);
        thread.start();
        for(int i=1; i<=10; i++){
            System.out.println("method body in main thread");
        }
    }
}
