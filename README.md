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



Java 8 has many new features and enhancements . In this repository we are going to learn Java 8 features but in diferent approach like 
1stly we should solve our problem using Functional style, and then we convert it into imperative to understand the other java 8 features. 

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
   
## Notes / Observation

* [Java 8 I2F Notes ](https://notesdocs.app/share/cbA5UGGquaySPD4bSjSWy5yUqfHZAlO3llCW-Java-8-I2F-)
* [Why functional Style Important](https://notesdocs.app/share/56qbTdjmbkjcTwHCEvEWVlHTUlMTuLhgVyOL-Why-functional-Style-is-Important)
