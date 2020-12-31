package com.zekunli.todo;

import javax.validation.constraints.Size;
import java.util.Date;

public class Todo {
    private int id;
    private String user;
    @Size(min = 2, message = "Enter at least 2 Characters.")
    private String desc;
    private Date deadline;

    public Todo() {}

    public Todo(int id, String user, String desc, Date deadline) {
        super();
        this.id = id;
        this.user = user;
        this.desc = desc;
        this.deadline = deadline;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Todo other = (Todo) obj;
        return id == other.id;
    }

    @Override
    public String toString() {
        return String.format("Todo [id=%s, user=%s, desc=%s, targetDate=%s]", id, user, desc, deadline);
    }
}
