package com.epam.amorozov;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;

@Data
public class Course implements Serializable {
    private String name;
    private ArrayList<Topic> topics;

    public Course() {
    }

    public Course(String name, ArrayList<Topic> topics) {
        this.name = name;
        this.topics = topics;
    }

    @Override
    public String toString() {
        return "Course: " + name + ", course topics= " + topics;
    }
}
