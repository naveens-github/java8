### Streams
* what is the difference between io.streams and util streams?
     * io streams meant for representing the data wrt file io operation. Util streams used to process the data from collection. 

* what is the difference between Collection and streams?
     * Collection: A group of objects in a single entity. 
     * Streams: used to process the objects from the collection. 

* Streams can used to process the data from collections and also used for group of elements & for arrays.
     * For group of values: Stream<Integer> s = Stream.of(9,99,999,9999,99999);    
                                          s.forEach(System.out::println);

##### Most used methods in streams.
* collect()  
* count() 
* sorted(Comparator) 
* min(Comparator) 
* max(Comparator) 
* forEach()
* toArray() 
* Stream.of() 
