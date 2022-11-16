package org.rohit.dto;

import org.rohit.entity.Address;
import org.rohit.entity.Person;

import java.util.List;

public class PersonRepo {
    public static List<Person> getPeples() {

        return List.of(new Person("rohit", "chavan", new Address("MH", "OSMANABAD"), List.of("7350281377", "7350281377")),
                new Person("Urmila", "Kadam", new Address("MH", "Pune"), null),
                new Person("rahul", "chavan", new Address("MH", "Solapur"), List.of("7350281387")),
                new Person("Ram", "Sharma", null, List.of("7358281377", "7350081377")),
                new Person("sita", "kadam", new Address("TH", "HYD"), List.of("7350244377")));

    }
}
