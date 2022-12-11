package com.siit.webapp;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private final String firstName;
    private final String lastName;
    private double average;

    List<Integer> grades = new ArrayList<>();


    public Student(String firstName, String lastName, List<Integer> grades) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = grades;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getAverage() {
        average = (getGrades().get(0) + getGrades().get(1) + getGrades().get(2)) / 3;
        return average;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    @Override
    public String toString() {
        return "Student" + " " +
                "FirstName=" + firstName + " " +
                ", LastName=" + lastName + "  Grades= " + " " + grades + " " + "Average= " + average;
    }
}
