### Method reference.
* Main advantage is: Code re-usablility.
* If we want to use MethodReference, both the method arguments should be same. No need to bother about modifiers, return type and all, just check method arguments. 
* Referred method can be a instance method or static method.


#### Syntax for Method Reference:
###### static: 
* classname::methodName; Eg: Test::m2;  
###### instance:  
* objectreference::methodName; Eg: Test t = new Test(); t::m2;
