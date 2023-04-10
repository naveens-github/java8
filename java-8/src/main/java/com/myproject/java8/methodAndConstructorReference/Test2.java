package com.myproject.java8.methodAndConstructorReference;
class TestRun{
    public void m1(){
        for(int i=0; i<10; i++){
            System.out.println("Child thread");
        }
    }
}
public class Test2 {
    public static void main(String[] args) {
        TestRun tr = new TestRun();
        Runnable r = tr::m1;
        Thread t = new Thread(r);
        t.start();

        for(int i=0; i<10; i++){
            System.out.println("Main thread");
        }

    }
}
