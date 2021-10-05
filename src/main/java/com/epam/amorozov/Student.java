package com.epam.amorozov;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Map;

@Data
public class Student implements Serializable {
    private String firstName;
    private String lastName;
    private Course course;
    private LocalDate startDate;
    private Map<Topic, Integer> scores;

    public Student(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Student(String firstName, String lastName, Course course, LocalDate startDate, Map<Topic, Integer> scores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.startDate = startDate;
        this.scores = scores;
    }

    @Override
    public String toString() {
        return "Student: " + firstName + ", lastName = " + lastName + ", courses = " + course + ", startDate = " + startDate + ", score = " + scores;
    }
}
