package com.company;

public class AddressBuilder {

    Address addressObject = new Address();

    public AddressBuilder(String addressString) {
        int commas = 0;

        for (Integer i = 0; i < addressString.length(); i++) {
            if (addressString.charAt(i) == ',') {
                commas++;
            }
        }

        if (commas == 1) {
            runReverse(addressString);
        } else if (commas == 2) {
            runForward(addressString);
        } else {
            System.out.println("Address incorrectly formatted, please try again");
        }
    }

    public void runReverse (String addressString) {
        addressObject.setZipcode(addressString.substring(addressString.length() - 5));
        addressString = pullFromString(addressString, 6);
        addressObject.setState(addressString.substring(addressString.lastIndexOf(' ') + 1));
        addressString = pullFromString(addressString, addressString.length() - (addressString.lastIndexOf( ' ') - 1));
        addressObject.setCity(addressString.substring(addressString.lastIndexOf(' ') + 1));
        addressString = pullFromString(addressString, addressString.length() - addressString.lastIndexOf( ' '));
        addressObject.setAddress(addressString);
    }

    public void runForward (String addressString) {
        addressObject.setAddress(addressString.substring(0, addressString.indexOf(',')));
        addressString = addressString.substring(addressString.indexOf(',') + 2);
        addressObject.setCity(addressString.substring(0, addressString.indexOf(' ')));
        addressString = addressString.substring(addressString.indexOf(' ') + 1);
        addressObject.setState(addressString.substring(0, addressString.indexOf(',')));
        addressString = addressString.substring(addressString.indexOf(',') + 2);
        addressObject.setZipcode(addressString);
    }

    public String pullFromString (String addressString, Integer i) {
        addressString = addressString.substring(0, addressString.length() - i);
        return addressString;
    }
}
