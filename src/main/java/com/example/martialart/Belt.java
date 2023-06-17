package com.example.martialart;

public class Belt {

    private String beltName;
    private int value;
    public Belt (String beltName, int value) {
        this.beltName = beltName;
        this.value = value;
    }

    public String getBeltName() {
        return this.beltName;
    }

    public int getValue() {
        return this.value;
    }
}
