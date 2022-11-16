package org.rohit.entity;

import java.util.List;

public class Person {
    private final String fname;
    private final String lname;
    private final Address address;

    private final List<String> phoneNumber;

    public Person(String fname, String lname, Address address, List<String> phoneNumber) {
        this.fname = fname;
        this.lname = lname;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public Address getAddress() {
        return address;
    }

    public List<String> getPhoneNumber() {
        return phoneNumber;
    }
}
