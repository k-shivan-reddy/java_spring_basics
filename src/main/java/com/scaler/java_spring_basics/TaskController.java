package com.scaler.java_spring_basics;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TaskController {
    int taskId= 0;
    private  List<Task> taskList = new ArrayList<Task>();
    public TaskController()
    {
        taskList.add(new Task(1,"x","y","1-22-2022"));
        taskList.add(new Task(2,"x","y","1-22-2022"));
        taskList.add(new Task(3,"x","y","1-22-2022"));
        taskId++;
    }
    @GetMapping("/tasks")
    List<Task> getTasks()
    {
        return taskList;

    }
    @PostMapping("/tasks")
    Task postTask(@RequestBody Task task)
    {
        taskId++;
        var newTask = new Task(taskId,"x","y","1-22-2022");
        taskList.add(newTask);
        return newTask;
    }
}
