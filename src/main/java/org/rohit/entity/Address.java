package org.rohit.entity;

public class Address {
    private final String state;
    private final String city;
    public Address(String state, String city) {
        this.state = state;
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }
}
