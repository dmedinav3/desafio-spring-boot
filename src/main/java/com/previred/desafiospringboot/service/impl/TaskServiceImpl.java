package com.previred.desafiospringboot.service.impl;

import com.previred.desafiospringboot.model.Task;
import com.previred.desafiospringboot.repository.TaskRepository;
import com.previred.desafiospringboot.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.NoResultException;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public Task updateTask(Task task) {
        Optional<Task> taskFinded = this.taskRepository.findById(task.getId());
        if(taskFinded.isPresent()){
            Task taskUpdate = taskFinded.get();
            taskUpdate.setId(task.getId());
            taskUpdate.setDescription(task.getDescription());
            taskRepository.save(taskUpdate);
            return taskUpdate;
        } else{
        throw new NoResultException("No se encontro resultados con el id" + task.getId());
    }
    }

    @Override
    public List<Task> getAllTask() {
        return taskRepository.findAll();
    }

    @Override
    public Task getTaskById(Long id) {
        Optional<Task> task = this.taskRepository.findById(id);
        if(task.isPresent()){
            return task.get();
        }else{
            throw new NoResultException("No se encontro resultados con el id" + id);
        }
    }

    @Override
    public void deleteTask(Long id) {
        Optional<Task> task = this.taskRepository.findById(id);

        if(task.isPresent()){
            this.taskRepository.delete(task.get());
        }else{
            throw new NoResultException("No se encontro resultados con el id" + id);
        }
    }
}
