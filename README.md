# Learn Java 8 By Converting Functional Style Code Into Imperative

<!-- TOC -->
* [Learn Java 8 By Converting Functional Style Code Into Imperative](#learn-java-8-by-converting-functional-style-code-into-imperative)
  * [Before Start](#before-start)
  * [Conclusion](#conclusion)
      * [Working With Map And Filter](#working-with-map-and-filter)
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
<!-- TOC -->

Java 8 has many new features and enhancements . In this repository we are going to learn Java 8 features but in diferent approach like 
1stly we should solve our problem using Functional style, and then we convert it into imperative to understand the other java 8 features. 

## Before Start 
    [](https://github.com/rohitchavan-git/Learn-Java-8-Stream)
    [](https://github.com/rohitchavan-git/java8-workshop)
    [](https://github.com/rohitchavan-git/Real-Time-Use-of-java-11-Stream-API)
    [](https://github.com/rohitchavan-git/OptionalInJava)

## Conclusion
#### Working With Map And Filter
#### **Filter** is Logically Equal to  **If Condition**

![](../../../../var/folders/f5/cl40hggx245bqsm8xtsq88xc0000gn/T/TemporaryItems/NSIRD_screencaptureui_Hdjh9m/Screenshot 2022-11-16 at 9.00.51 PM.png)
#### **The Map** is Logically Equal to **get + add to the resultant Collection**

![](../../../../var/folders/f5/cl40hggx245bqsm8xtsq88xc0000gn/T/TemporaryItems/NSIRD_screencaptureui_ulGvyQ/Screenshot 2022-11-16 at 9.01.23 PM.png)
#### Some observations while working with **Collectors.groupingBy()**

   1. Collectors.GroupingBy(Function<T,U> function) we can achieve this using **Map's** **computeIfAbsent()** method
    ![](../../../../var/folders/f5/cl40hggx245bqsm8xtsq88xc0000gn/T/TemporaryItems/NSIRD_screencaptureui_9Rixjg/Screenshot 2022-11-16 at 9.10.15 PM.png)
   
   2. **Collectors.GroupingBy(Function<T,U> function,Collectors collector)**
    ![](../../../../var/folders/f5/cl40hggx245bqsm8xtsq88xc0000gn/T/TemporaryItems/NSIRD_screencaptureui_0WbLXC/Screenshot 2022-11-16 at 9.12.03 PM.png)
   
   3. **Collectors.GroupingBy(,Collectors.counting())**
    ![](../../../../var/folders/f5/cl40hggx245bqsm8xtsq88xc0000gn/T/TemporaryItems/NSIRD_screencaptureui_ZXk4yG/Screenshot 2022-11-16 at 9.14.21 PM.png)
   
   4. **Collectors.GroupingBy(,mapping(function,Collector))**
    ![](../../../../var/folders/f5/cl40hggx245bqsm8xtsq88xc0000gn/T/TemporaryItems/NSIRD_screencaptureui_AKrkjV/Screenshot 2022-11-16 at 9.15.30 PM.png)
   
   5. **Collectors.GroupingBy(Function<T,U>,filtering(Function ,Collector ))**
    ![](/Users/rohit/Desktop/Screenshot 2022-11-16 at 9.29.05 PM.png)
   
   6. **GroupingBy with Collect as a Map ( Map of String of Map )**
   ![](../../../../var/folders/f5/cl40hggx245bqsm8xtsq88xc0000gn/T/TemporaryItems/NSIRD_screencaptureui_XMBUbZ/Screenshot 2022-11-16 at 10.56.46 PM.png)
#### Some observations while working with **Collectors.toMap(Function , Function )**

1. **toMap(Function key , Function value)**
   
   it doesn't support null keys or values if you provide a null key or null value, it will though null-pointer
   exceptions
   ![](../../../../var/folders/f5/cl40hggx245bqsm8xtsq88xc0000gn/T/TemporaryItems/NSIRD_screencaptureui_cWtXf3/Screenshot 2022-11-16 at 10.40.53 PM.png)![](../../../../var/folders/f5/cl40hggx245bqsm8xtsq88xc0000gn/T/TemporaryItems/NSIRD_screencaptureui_XQMrZl/Screenshot 2022-11-16 at 10.43.34 PM.png)

2. **toMap() with duplicate Key protection** using **3rd parameter**
   ![](../../../../var/folders/f5/cl40hggx245bqsm8xtsq88xc0000gn/T/TemporaryItems/NSIRD_screencaptureui_Cph84A/Screenshot 2022-11-16 at 10.50.47 PM.png)
#### **Sort Collection** 
   ![](../../../../var/folders/f5/cl40hggx245bqsm8xtsq88xc0000gn/T/TemporaryItems/NSIRD_screencaptureui_Ffr1pW/Screenshot 2022-11-16 at 11.02.00 PM.png)
#### **Any Match**
   ![](../../../../var/folders/f5/cl40hggx245bqsm8xtsq88xc0000gn/T/TemporaryItems/NSIRD_screencaptureui_N98ajS/Screenshot 2022-11-16 at 11.03.35 PM.png)
#### **Find First with default Value**
   ![](../../../../var/folders/f5/cl40hggx245bqsm8xtsq88xc0000gn/T/TemporaryItems/NSIRD_screencaptureui_9XtJdb/Screenshot 2022-11-16 at 11.04.42 PM.png)
#### **Collectors.joining(delimiter)**
   ![](../../../../var/folders/f5/cl40hggx245bqsm8xtsq88xc0000gn/T/TemporaryItems/NSIRD_screencaptureui_aYBP0N/Screenshot 2022-11-16 at 11.06.38 PM.png)
#### **Count** 
   ![](../../../../var/folders/f5/cl40hggx245bqsm8xtsq88xc0000gn/T/TemporaryItems/NSIRD_screencaptureui_JSwUei/Screenshot 2022-11-16 at 11.07.07 PM.png)
####  **takeWhile**
   ![](../../../../var/folders/f5/cl40hggx245bqsm8xtsq88xc0000gn/T/TemporaryItems/NSIRD_screencaptureui_BJDQCE/Screenshot 2022-11-16 at 11.15.55 PM.png)
   

