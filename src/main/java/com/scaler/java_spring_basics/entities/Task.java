package com.scaler.java_spring_basics.entities;

public class Task {
    int id;
    String title;
    String description;
    String dueDate;

    public Task(int id,String title,String description,String dueDate)
    {
        this.id = id;
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
    }

    public String getDescription() {
        return description;
    }

    public String getDueDate() {
        return dueDate;
    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }

}
