package com.example.martialart;

public class Grade {
    //This Class is used for setting grade for each belt

    private String gradeName;

    Grade (String grade) {
        this.gradeName = grade;
    }

    public String getGradeName() {
        return  this.gradeName;
    }

    public void setGradeName(String grade) {
        this.gradeName = grade;
    }
}
