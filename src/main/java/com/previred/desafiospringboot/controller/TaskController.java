package com.previred.desafiospringboot.controller;

import com.previred.desafiospringboot.model.Status;
import com.previred.desafiospringboot.model.Task;
import com.previred.desafiospringboot.service.StatusService;
import com.previred.desafiospringboot.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.NoResultException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @Autowired
    private StatusService statusService;

    @GetMapping("/tasks")
    public ResponseEntity<List<Task>> getAllTasks() {

        List<Task> tasks = taskService.getAllTask();
        return new ResponseEntity<>(tasks, HttpStatus.OK);
    }

    @PostMapping("/tasks")
    public ResponseEntity<String> createTask(@RequestBody Task task) {
        try {
       //Status status=statusService.getStatusById(task.getStatus().getId());
            Status status=statusService.validateStatus(task.getStatus());
        //    statusService.validateStatus(task.getStatus());
            taskService.createTask(task);
        }catch (NoResultException noResultException){
            return new ResponseEntity<>(noResultException.getMessage(), HttpStatus.NOT_FOUND);
        }
        catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>("tarea creada", HttpStatus.CREATED);

    }

    @PatchMapping("/tasks/{taskId}")
    public ResponseEntity<Task> updateTask(@PathVariable Long taskId, @RequestBody Task task) {
        task.setId(taskId);
        return new ResponseEntity<>(task, HttpStatus.OK);
    }

    @DeleteMapping("/tasks/{taskId}")
    public ResponseEntity<String> deleteTask(@PathVariable Long taskId) {
        try {
            this.taskService.deleteTask(taskId);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>("tarea eliminada", HttpStatus.OK);
    }
}
