## Functional interface
* Interface which contains single abstract method. We can have static methods and also default methods but we should have only one abstract method.

##### Examples:
1. Runnable: contains only run() method.
2. Callable: contains only call() method.
3. ActionListner: contains only actionPerformed() method.
4. Comparable: contains only compareTo() method.

### Pre-defined Functional Interface 
1. Predicate  
2. Function 
3. Consumer 
4. Supplier 

* Above Interfaces are in java.util.function package

### Predicate:
* To check some conditional checkings. This function will return boolean value - eg: true else false. 
* It has one abstract method i.e, test() method. 
* It has multiple default methods i.e, 1. negate() 2. and() 3. or()
#### Predicate joining:
p1: check whether the given number 10.  
p2: Is even number or not?

Predicate has some default methods. Using those methods we can do some operations.
1. negate(): we can make negative statement of p1, i.e, check the given number is not 10.
2. and(): p1.and(p2)
3. or(): p1.or(p2)


### Function:
* This is same as the Predicate functionalInterface, but it will return any value. This is not like Predicate(returning True, False). 
* It has one abstract method i.e, apply() method.    
* Below is the function representation, where T is an input parameter and R is a return type.  
Interface Function<T, R> { 
R apply(T t);   
} 
#### Function Chaining:
* Function functionalInterface has some default methods like: andThen(), compose().
* Example: f1.andthen(f2) => f1 will be applied followed by f2.    
* Example2: f1.compose(f2) => f2 will be applied followed by f1.   

* Functional funtionalInterface has identity() method as well. i.e, static method.

### Consumer:  
* Consumer accepts the value and won't return anything.  
* Consumer syntax:  
Interface consumer<T>  
  {  
  void accept(T t);  
  } 
  
#### Consumer Chaining:
  * For Consumer FunctionalInterface, there is one default method, i.e, andThen();   
  
  
  
  

      

