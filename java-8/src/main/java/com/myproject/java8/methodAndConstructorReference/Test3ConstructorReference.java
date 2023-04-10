package com.myproject.java8.methodAndConstructorReference;

class Sample{
    Sample(){
        System.out.println("Sample class constructor execution");
    }
}

interface Interf3 {
    public Sample get();
}
public class Test3ConstructorReference {
    public static void main(String[] args) {
        Interf3 i = Sample::new;
        i.get();

    }
}
