package com.zekunli.todo;

import java.util.Objects;

public class Todo {
    private String name;
    private String category;

    public Todo(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Todo todo = (Todo) o;
        return getName().equals(todo.getName()) && getCategory().equals(todo.getCategory());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCategory());
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
