package com.scaler.java_spring_basics.controllers;

import com.scaler.java_spring_basics.entities.Task;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class TaskController {
    AtomicInteger taskId= new AtomicInteger(0);
    private  List<Task> taskList = new ArrayList<Task>();
    public TaskController()
    {
        taskList.add(new Task(taskId.incrementAndGet(),"x","y","1-22-2022"));
        taskList.add(new Task(taskId.incrementAndGet(),"x","y","1-22-2022"));
        taskList.add(new Task(taskId.incrementAndGet(),"x","y","1-22-2022"));
    }
    @GetMapping("/tasks")
    List<Task> getTasks()
    {
        return taskList;

    }
    @PostMapping("/tasks")
    Task postTask(@RequestBody Task task)
    {
        var newTask = new Task(taskId.incrementAndGet(),"x","y","1-22-2022");
        taskList.add(newTask);
        return newTask;
    }
    @GetMapping("/task/{id}")
    Task getTasks(@PathVariable("id") Integer id)
    {
        Task ret = null;
        for(var tsk:taskList)
        {
            if(tsk.getId() == id){
             ret = tsk;
            }
        }
        return  ret;
    }
    @DeleteMapping("/task/{id}")
    Task deleteTask(@PathVariable("id") Integer id)
    {
        return  null;
    }
}
