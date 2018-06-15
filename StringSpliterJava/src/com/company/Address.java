package com.company;

public class Address {
    public static String address;
    public static String city;
    public static String state;
    public static String zipcode;

    public String getAddress() {
        return this.address;
    }

    public String setAddress(String value) {
        return this.address = value;
    }

    public String getCity() {
        return this.city;
    }

    public String setCity(String value) {
        return this.city = value;
    }

    public String getState() {
        return this.state;
    }

    public String setState(String value) {
        return this.state = value;
    }

    public String getZipcode() {
        return this.zipcode;
    }

    public String setZipcode(String value) {
        return this.zipcode = value;
    }

    public Address () {}  // I know that this is needed but what does it do.
}
