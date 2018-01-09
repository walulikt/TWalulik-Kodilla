package com.kodilla.spring.portfolio;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class TaskList {

    private List<String> tasks;

    public TaskList() {
        this.tasks=new ArrayList<>();
    }

    public List<String> addTask (String taskDescription) {
       this.tasks.add(taskDescription);
       return tasks;
    }

    public List<String> getTasks() {
        return tasks;
    }
}
