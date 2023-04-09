### Auto boxing:   
* Automatic conversion of primitive type to Wrapper object.
  
### Auto unboxing:
  * Automatic conversion of Wrapper object to primitive type.  
  
### Generics - Type parameter
  * For Type parameters primitive types are not allowed, we need to mention Wrapper objects only.  

1. We have some premitive type FunctionalInterfaces, they are :

1. IntFunction<R>   
       public R apply(int i);
  
2. LongFunction<R>     
       public R apply(int i);
  
3. DoubleFunction<R>    
       public R apply(int i);
  
4. ToIntFunction<T>      
       public int applyAsInt(T t);   
  
5.  ToLongFunction<T>            
       public Long applyAsLong(T t);    
  
6. ToDoubleFunction<T>     
      public Double applyAsDouble(T t);
  
7. IntToLongFunction    
      public long applyAsLong(int i);
  
8. IntToDoubleFunction      
      public Double applyAsDouble(int i);
  
9. LongToIntFunction     
      public int applyAsInt(Long l);
  
10. LongToDoubleFunction     
      public Double applyAsDouble(long l);
  
11. DoubleToIntFunction   
      public int applyAsInt(Double d);
  
12. DoubleToLongFunction   
      public long applyAsLong(Double d);
  
13. ToIntBiFunction<T,U>       
      public int applyAsInt(T t, U u);
  
14. ToLongBiFunction<T,U>   
      public long applyAsLong(T t, U u);
  
15. ToDoubleBiFunction<T,U>     
      public Double applyAsDouble(T t, U u);
