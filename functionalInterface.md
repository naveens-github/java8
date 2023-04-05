## Functional interface
* Interface which contains single abstract method. We can have static methods and also default methods but we should have only one abstract method.

##### Examples:
1. Runnable: contains only run() method.
2. Callable: contains only call() method.
3. ActionListner: contains only actionPerformed() method.
4. Comparable: contains only compareTo() method.

### Pre-defined Functional Interface 
1. Predicate
2. Consumer
3. Function
4. Supplier

* Above Interfaces are in java.util.function package

### Predicate:
* To check some conditional checkings. This function will return boolean value - eg: true else false. 
* It has test() method. 
