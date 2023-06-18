package com.example.martialart;

public class Belt {

    private String beltName;
    private int value;

    private Grade grade;
    public Belt (String beltName, int value, Grade grade) {
        this.beltName = beltName;
        this.value = value;
        this.grade = grade;
    }

    public String getBeltName() {
        return this.beltName;
    }

    public int getValue() {
        return this.value;
    }

    public Grade getGrade() {
        return this.grade;
    }
}
