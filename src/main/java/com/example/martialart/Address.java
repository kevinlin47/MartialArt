package com.example.martialart;

public class Address {

    private String city;
    private String streetAddress;
    private String aptNumber;
    private String state;
    private String zipCode;

    public Address(String city, String streetAddress, String aptNumber, String state, String zipCode) {
        this.city = city;
        this. streetAddress = streetAddress;
        this.aptNumber = aptNumber;
        this.state = state;
        this.zipCode = zipCode;
    }

    public Address(String city, String streetAddress, String state, String zipCode) {
        this.city = city;
        this. streetAddress = streetAddress;
        this.aptNumber = null;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreetAddress() {
        return this.streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getAptNumber() {
        return this.aptNumber;
    }

    public void setAptNumber(String aptNumber) {
        this.aptNumber = aptNumber;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return this.zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

}
