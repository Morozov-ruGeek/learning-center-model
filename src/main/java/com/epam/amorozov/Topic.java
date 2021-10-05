package com.epam.amorozov;

import lombok.Data;

import java.io.Serializable;

@Data
public class Topic implements Serializable {
    private String name;
    private Integer hoursDuration;

    public Topic() {
    }

    public Topic(String name, int hoursDuration) {
        this.name = name;
        this.hoursDuration = hoursDuration;
    }

    @Override
    public String toString() {
        return "Topic: " + name + ", duration= " + hoursDuration;
    }
}
