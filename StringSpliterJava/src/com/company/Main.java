package com.company;

public class Main {

    public static void main (String [] args) {

        String address1 = "101 West Coates St, Moberly MO, 63552";
        String address2 = "101 West Coates St Moberly, Missouri 63552";
        String address3 = "1212 Bond St, Moberly MO, 65270";

        AddressBuilder addressBuilder = new AddressBuilder(address3);

        System.out.println("Address: " + addressBuilder.addressObject.getAddress());
        System.out.println("City: " + addressBuilder.addressObject.getCity());
        System.out.println("State: " + addressBuilder.addressObject.getState());
        System.out.println("Zip Code: " + addressBuilder.addressObject.getZipcode());
    }
}
