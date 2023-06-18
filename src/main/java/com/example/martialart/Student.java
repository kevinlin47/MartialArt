package com.example.martialart;

import java.util.Date;
import java.util.Random;

public class Student {
    private String firsName;
    private String lastName;
    private final int studentId;
    private Address address;
    private Date birthDate;
    private Belt belt;
    private String email;
    private String phoneNumber;

    public Student(String firsName, String lastName, int studentId, Address address, Date birthDate, Belt belt, String email, String phoneNumber) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.address = address;
        this.birthDate = birthDate;
        this.belt = belt;
        this.email = email;
        this. phoneNumber = phoneNumber;

        //Randomly generate a value
        //Will add validity check later
        Random rand = new Random();
        //Add plus 1 so we don't get zero
        this.studentId = rand.nextInt(100000) + 1;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getStudentId() {
        return this.studentId;
    }

    public Address getAddress() {
        return  this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Belt getBelt() {
        return this.belt;
    }

    public void setBelt(Belt belt) {
        this.belt = belt;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
