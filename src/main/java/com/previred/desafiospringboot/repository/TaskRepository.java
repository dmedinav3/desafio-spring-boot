package com.previred.desafiospringboot.repository;

import com.previred.desafiospringboot.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TaskRepository extends JpaRepository<Task, Long> {
}
