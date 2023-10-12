package org.example;

import java.util.Objects;

public class Apple {
    String name;
    int calories;

    public Apple(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Apple apple = (Apple) o;
        return calories == apple.calories && Objects.equals(name, apple.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, calories);
    }

    @Override
    public String toString() {
        return "Apple{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                '}';
    }
}
