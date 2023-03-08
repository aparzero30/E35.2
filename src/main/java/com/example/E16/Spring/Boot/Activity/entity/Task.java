package com.example.E16.Spring.Boot.Activity.entity;


import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;

@jakarta.persistence.Entity
@Table (name = "task_table")
public class Task {



    @GeneratedValue
    @jakarta.persistence.Id


    @Column(name="task_id")
    private Integer taskId;
    @Column(name="title")
    private String title;

    @Column(name="description")
    private String description;
    @Column(name="completed")
    private String completed;


    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCompleted() {
        return completed;
    }

    public void setCompleted(String completed) {
        this.completed = completed;
    }
}
