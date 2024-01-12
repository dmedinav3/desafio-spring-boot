package com.previred.desafiospringboot.service;

import com.previred.desafiospringboot.model.Task;

import java.util.List;

public interface TaskService {

    Task createTask(Task task);

    Task updateTask(Task task);

    List<Task> getAllTask();

    Task getTaskById(Long id);

    void deleteTask(Long id);

}
