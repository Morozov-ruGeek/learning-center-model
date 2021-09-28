package com.epam.amorozov;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Topic topic = (Topic) o;
        return name.equals(topic.name) && hoursDuration.equals(topic.hoursDuration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, hoursDuration);
    }

    @Override
    public String toString() {
        return "Topic: " + name + ", duration= " + hoursDuration;
    }
}
