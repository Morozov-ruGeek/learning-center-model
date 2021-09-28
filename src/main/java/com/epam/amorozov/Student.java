package com.epam.amorozov;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Map;
import java.util.Objects;

@Data
public class Student implements Serializable {
    private String firstName;
    private String lastName;
    private Course course;
    private LocalDate startDate;
    private Map<Topic, Integer> scores;

    public Student(String firstName, String lastName, Course course, LocalDate startDate, Map<Topic, Integer> scores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.startDate = startDate;
        this.scores = scores;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return firstName.equals(student.firstName) &&
                lastName.equals(student.lastName) &&
                course.equals(student.course) &&
                startDate.equals(student.startDate) &&
                scores.equals(student.scores);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, course, startDate, scores);
    }

    @Override
    public String toString() {
        return "Student: " + firstName + ", lastName = " + lastName + ", courses = " + course + ", startDate = " + startDate + ", score = " + scores;
    }
}
