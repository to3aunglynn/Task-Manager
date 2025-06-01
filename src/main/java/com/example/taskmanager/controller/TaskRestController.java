package com.example.taskmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.taskmanager.model.Task;
import com.example.taskmanager.repository.TaskRepository;
import java.util.List;

@RestController
@RequestMapping("/api/tasks")
@CrossOrigin(origins = "*")
public class TaskRestController {

    @Autowired
    private TaskRepository taskRepository;

    // Get all tasks
    @GetMapping
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    // Get a single task by ID
    @GetMapping("/{id}")
    public ResponseEntity<Task> getTaskById(@PathVariable Integer id) {
        return taskRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Create a new task
    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return taskRepository.save(task);
    }

    // Update a task
    @PutMapping("/{id}")
    public ResponseEntity<Task> updateTask(@PathVariable Integer id, @RequestBody Task task) {
        if (!taskRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        task.setId(id);
        return ResponseEntity.ok(taskRepository.save(task));
    }

    // Delete a task
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable Integer id) {
        if (!taskRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        taskRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}