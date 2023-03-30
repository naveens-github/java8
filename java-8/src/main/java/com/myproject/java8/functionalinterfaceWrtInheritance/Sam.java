package com.myproject.java8.functionalinterfaceWrtInheritance;

import com.myproject.java8.functionalinterfaceAnnotation.Robert;

/* Declared as @FunctionalInterface but still it is not giving an error because parent interface
 is a functional interface. */
@FunctionalInterface
public interface Sam extends Robert {
}


/* We can declare the same abstract method in child class too, it will not through an error */
//@FunctionalInterface
//public interface Sam extends Robert {
//    public void m1();
//}


/* If we declare a different method in child interface it will through an error. */
//@FunctionalInterface
//public interface Sam extends Robert {
//    public void m2();
//}

/* if we do not mention as @Functional interface we can declare different method name as well */
//public interface Sam extends Robert {
//    public void m2();
//}