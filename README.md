# Learn Java 8 By Converting Functional Style Code Into Imperative

<!-- TOC -->
* [Learn Java 8 By Converting Functional Style Code Into Imperative](#learn-java-8-by-converting-functional-style-code-into-imperative)
  * [Before Start](#before-start)
  * [Quick Look](#quick-look)
      * [**Filter** is Logically Equal to  **If Condition**](#filter-is-logically-equal-to-if-condition)
      * [**The Map** is Logically Equal to **get + add to the resultant Collection**](#the-map-is-logically-equal-to-get--add-to-the-resultant-collection)
      * [Some observations while working with **Collectors.groupingBy()**](#some-observations-while-working-with-collectorsgroupingby)
      * [Some observations while working with **Collectors.toMap(Function , Function )**](#some-observations-while-working-with-collectorstomapfunction--function-)
      * [**Sort Collection**](#sort-collection)
      * [**Any Match**](#any-match)
      * [**Find First with default Value**](#find-first-with-default-value)
      * [**Collectors.joining(delimiter)**](#collectorsjoiningdelimiter)
      * [**Count**](#count)
      * [**takeWhile**](#takewhile)
  * [Notes / Observation](#notes--observation)
<!-- TOC -->



This repository focuses on exploring the various new features and enhancements introduced in Java 8. However, we take a different approach by first solving problems using the functional programming style, and then converting them into imperative solutions to gain a deeper understanding of other Java 8 features. By following this approach, we can grasp the benefits and nuances of functional programming in Java and explore how it can be leveraged effectively. 
Join us on this journey as we dive into Java 8 and unlock its potential in a practical and insightful manner.

## Before Start

* [Learn Java 8-Stream](https://github.com/rohitchavan-git/Learn-Java-8-Stream)
* [ Java 8 Workshop ](https://github.com/rohitchavan-git/java8-workshop)
* [Real Time Use Cases java 11 ](https://github.com/rohitchavan-git/Real-Time-Use-of-java-11-Stream-API)
* [Optional In Use](https://github.com/rohitchavan-git/OptionalInJava)

## Quick Look
#### **Filter** is Logically Equal to  **If Condition**
![](src/main/resources/filterAsIf.png)

#### **The Map** is Logically Equal to **get + add to the resultant Collection**
![](src/main/resources/MapAsGetToResultantCollection.png)

#### Some observations while working with **Collectors.groupingBy()**

   1. Collectors.GroupingBy(Function<T,U> function) we can achieve this using **Map's** **computeIfAbsent()** method
   ![](src/main/resources/grpBy.png)
   2. **Collectors.GroupingBy(Function<T,U> function,Collectors collector)**
   ![](src/main/resources/grpByCollectToSet.png)
   3. **Collectors.GroupingBy(,Collectors.counting())**
   ![](src/main/resources/grpByCounting.png)
   4. **Collectors.GroupingBy(,mapping(function,Collector))**
   ![](src/main/resources/grpByMapping.png)
   5. **Collectors.GroupingBy(Function<T,U>,filtering(Function ,Collector ))**
   ![](src/main/resources/grpByFiltering.png)
   6. **GroupingBy with Collect as a Map ( Map of String of Map )**
   ![](src/main/resources/grpByCollectToMap.png)
#### Some observations while working with **Collectors.toMap(Function , Function )**

1. **toMap(Function key , Function value)**
   
     it doesn't support null keys or values if you provide a null key or null value, it will though null-pointer
     exceptions
     ![](src/main/resources/mapWithoutDuplicateKeyProtection.png)

2. **toMap() with duplicate Key protection** using **3rd parameter**
   ![](src/main/resources/mapWithDuplicateKeyProtection.png)
#### **Sort Collection** 
   ![](src/main/resources/sortCollection.png)
#### **Any Match**
   ![](src/main/resources/anyMatch.png)
#### **Find First with default Value**
   ![](src/main/resources/findFirstWithDefaultValue.png)
#### **Collectors.joining(delimiter)**
   ![](src/main/resources/joining.png)
#### **Count** 
   ![](src/main/resources/counting.png)
####  **takeWhile**
   ![](src/main/resources/takeWhile.png)

## Summary   

1. `filter`: The `filter` method in Java 8 streams allows you to apply a condition or predicate to elements in a
   collection and retain only those elements that satisfy the condition. It is similar to an `if` condition that filters
   elements based on a specific criterion.

2. `map`: The `map` method in Java 8 streams transforms each element in a collection by applying a given function to it.
   It is similar to using `get` to retrieve a value and then adding or putting the resultant transformed value into a
   collection.

3. `groupBy` collector using `map.computeIfAbsent()`: By using the `computeIfAbsent` method of the `Map` interface in
   Java 8, you can implement a grouping operation where elements are grouped by a certain key. If the key is not present
   in the map, a value can be computed using the provided mapping function (`Function<T, U>`). This allows you to create
   groups in the form of a map with keys and associated values.

4. `merge` method for implementing `groupBy` and `counting`: The `merge` method in Java 8 allows you to merge values
   into a map using a specified key and an operation. It is commonly used for grouping and counting elements in a
   collection. For example, you can merge values into a map where the key is a person's name, the initial value is 1,
   and the operation is to sum the values if a duplicate key is encountered.

5. Modifications in Java 8 `Map` collection: In Java 8, the `toMap` method in the `Collectors` class is used to create a
   map from a stream. However, it has certain restrictions such as not allowing duplicate keys or values, as well as
   disallowing null keys and values. To handle duplicate keys, you can provide a key conflict resolution strategy using
   the third parameter of `Collectors.toMap`. This allows you to specify how to handle conflicts when two keys are the
   same.

## Notes / Observation

* [Java 8 I2F Notes ](https://notesdocs.app/share/cbA5UGGquaySPD4bSjSWy5yUqfHZAlO3llCW-Java-8-I2F-)
* [Why functional Style Important](https://notesdocs.app/share/56qbTdjmbkjcTwHCEvEWVlHTUlMTuLhgVyOL-Why-functional-Style-is-Important)
