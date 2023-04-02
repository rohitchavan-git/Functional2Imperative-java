package org.rohit;

import org.rohit.entity.Address;
import org.rohit.entity.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringJoiner;
import java.util.function.Function;

import static java.util.Optional.of;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.filtering;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;
import static java.util.stream.Collectors.toSet;

public class Application {


    public static void main(String[] args) {

        String idea = "welcome to intellij idea tips session ";


        List<Integer> integers = takeWhile();

        System.out.println("demo");

        System.out.println(integers);


    }

    private static void stringHolder(String name) {
        throw new UnsupportedOperationException("method not implemented");
    }
    private static void stringDemo(String name) {
        throw new UnsupportedOperationException("method not implemented");
    }

    private static List<Integer> takeWhile() {
        List<Integer> oneToTen = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> takeUpto5 = oneToTen.stream()
                .takeWhile(i -> i != 5)
                .collect(toList());
        System.out.println(takeUpto5);


        List<Integer> takeUpto05 = new ArrayList<>();
        for (Integer i : oneToTen) {
            if (i == 5) {
                break;
            }
            takeUpto05.add(i);
        }

        return takeUpto05;
    }

    private static final String ROHIT = "ROHIT";

    private static void grpByMap(List<Person> allPerson) {
        Map<String, Map<String, Person>> stringMapMap = allPerson.stream()
                .collect(groupingBy(Person::getFname,
                        toMap(Person::getFname, Function.identity())));

        System.out.println(stringMapMap);

        Map<String, Map<String, Person>> stringMapMap1 = new HashMap<>();
        for (Person person : allPerson) {
            if (stringMapMap1.computeIfAbsent(person.getFname()
                            , k -> new HashMap<>())
                    .put(person.getFname(), person) != null) {
                throw new IllegalStateException("Duplicate key");
            }
        }

        System.out.println(stringMapMap1);
    }

    private static void grpByFilterCollect(List<Person> allPerson) {

        Map<String, List<Person>> stringListMap = allPerson.stream()
                .collect(groupingBy(Person::getFname,
                        filtering(person -> person.getFname().length() > 5
                                , toList())));

        System.out.println(stringListMap);

        Map<String, List<Person>> stringListMap1 = new HashMap<>();
        for (Person person : allPerson) {
            List<Person> people = stringListMap1
                    .computeIfAbsent(person.getFname(), k -> new ArrayList<>());
            if (person.getFname().length()>5) {
                people.add(person);
            }
        }

        System.out.println(stringListMap1);
    }

    private static void count(List<Person> allPerson) {
        long count = of(allPerson)
                .stream()
                .flatMap(List::stream)
                .map(Person::getAddress)
                .map(Address::getCity)
                .count();

        long count2 = 0L;
        for (Person person : allPerson) {
            Address address = person.getAddress();
            String city = address.getCity();
            count2++;
        }
    }

    private static void stringJoinning(List<Person> allPerson) {
        String joiningString = allPerson.stream()
                .map(Person::getFname)
                .collect(joining(","));

        StringJoiner joiner = new StringJoiner(",");
        for (Person person : allPerson) {
            String fname = person.getFname();
            joiner.add(fname);
        }
        String joiningString2 = joiner.toString();
    }

    private static void findFirstWithDeafultValue(List<Person> allPerson) {
        Person firstRohit = allPerson.stream()
                .filter(person -> person.getFname().equals(ROHIT))
                .findFirst().orElse(null);

        Person firstRohit2 = null;
        for (Person person : allPerson) {
            if (person.getFname().equals(ROHIT)) {
                firstRohit2 = person;
                break;
            }
        }
    }

    private static void anyMatch(List<Person> allPerson) {
        boolean isRohitPresen = allPerson.stream()
                .anyMatch(person -> person.getFname().equals(ROHIT));

        boolean isRohitRR = false;
        for (Person person : allPerson) {
            if (person.getFname().equals(ROHIT)) {
                isRohitRR = true;
                break;
            }
        }
    }

    private static void sortAndCollect(List<Person> allPerson) {
        List<Person> sortedByFnameAndLname = allPerson.stream()
                .sorted(Comparator.comparing(Person::getFname)
                        .thenComparing(Person::getLname))
                .collect(toList());

        List<Person> sortedByFnameAndLname2 = new ArrayList<>();
        for (Person person : allPerson) {
            sortedByFnameAndLname2.add(person);
        }
        sortedByFnameAndLname2.sort(Comparator.comparing(Person::getFname)
                .thenComparing(Person::getLname));
    }

    private static void mapWithoutDuplicateKeyProtection(List<Person> allPerson) {
        Map<String, List<String>> stringListMap = allPerson.stream()
                .collect(toMap(Person::getFname, Person::getPhoneNumber));

        Map<String, List<String>> stringListMap2 = new HashMap<>();
        for (Person person : allPerson) {
            if (stringListMap2.
                    put(person.getFname(), person.getPhoneNumber()) != null) {
                throw new IllegalStateException("Duplicate key");
            }
        }
    }

    private static void mapWithDuplicateKeyProtection(List<Person> allPerson) {
        HashMap<String, List<String>> stringListHashMap = allPerson.stream()
                .collect(toMap(Person::getFname, Person::getPhoneNumber,
                        (oldKey, newKey) -> newKey, HashMap::new));


        HashMap<String, List<String>> stringListHashMap2 = new HashMap<>();
        for (Person person : allPerson) {
            stringListHashMap2.put(person.getFname(), person.getPhoneNumber());
        }
    }

    private static void grpByMappingCollect(List<Person> allPerson) {
        Map<String, List<Address>> grpByMappingCollectToList = allPerson.stream()
                .collect(groupingBy(Person::getFname,
                        mapping(Person::getAddress, toList())));

        Map<String, List<Address>> grpByMappingCollectToList1 = new HashMap<>();
        for (Person person1 : allPerson) {
            Address person1Address = person1.getAddress();
            grpByMappingCollectToList1.computeIfAbsent(person1.getFname(),
                    k -> new ArrayList<>()).add(person1Address);
        }
    }

    private static void grpByCounting(List<Person> allPerson) {
        Map<String, Long> grpAndCounting = allPerson.stream()
                .collect(groupingBy(Person::getFname,
                        counting()));

        Map<String, Long> grpByFnameAndCounting = new HashMap<>();
        for (Person person : allPerson) {
            grpByFnameAndCounting.merge(person.getFname(),
                    1L, Long::sum);
        }
    }

    private static void grpByCollectIntoSet(List<Person> allPerson) {
        Map<String, Set<Person>> stringSetMap = allPerson.stream()
                .collect(groupingBy(Person::getFname, toSet()));


        Map<String, Set<Person>> stringSetMap1 = new HashMap<>();
        for (Person person : allPerson) {
            stringSetMap1.computeIfAbsent(person.getFname(),
                            k -> new HashSet<>())
                    .add(person);
        }
    }

    private static void groupByDP(List<Person> allPerson) {
        Map<String, List<Person>> grpByName = allPerson.stream()
                .collect(groupingBy(Person::getFname));

        Map<String, List<Person>> grpByName2 = new HashMap<>();
        for (Person person : allPerson) {
            // computeIfAbsent checks whether fname is present if yes just add a new element in a value list
            // if the key does not present it will check the second parameter of computeIfAbsent and create an empty list as a value
            grpByName2.computeIfAbsent(person.getFname(), k -> new ArrayList<>())
                    .add(person);
        }
    }

    private static void getAll(List<Person> allPerson) {
        List<String> getAllFirstName = allPerson.stream()
                .map(Person::getFname)
                .collect(toList());

        List<String> collect = new ArrayList<>();
        for (Person person : allPerson) {
            collect.add(person.getFname());
        }
    }

    private static void findByName(List<Person> allPerson, String name) {
        List<Person> getAllRohit = allPerson.stream()
                .filter(person -> name.equals(person.getFname()))
                .collect(toList());

        List<Person> getAllRohit2 = new ArrayList<>();

        for (Person person : allPerson) {
            if (person.getFname().equals("ROHIT")) {
                getAllRohit2.add(person);
            }
        }
    }
}