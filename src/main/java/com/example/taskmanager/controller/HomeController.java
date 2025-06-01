package com.example.taskmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.taskmanager.model.Task;
import com.example.taskmanager.repository.TaskRepository;
import java.util.Arrays;

@Controller
public class HomeController {

    @Autowired
    private TaskRepository taskRepository;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("tasks", taskRepository.findAll());
        model.addAttribute("newTask", new Task());
        model.addAttribute("priorities", Arrays.asList("Low", "Medium", "High"));
        model.addAttribute("statuses", Arrays.asList("Todo", "In Progress", "Done"));
        return "index";
    }

    @PostMapping("/task/create")
    public String createTask(@ModelAttribute Task task) {
        taskRepository.save(task);
        return "redirect:/";
    }

    @PostMapping("/task/update/{id}")
    public String updateTask(@PathVariable Integer id, @ModelAttribute Task task) {
        task.setId(id);
        taskRepository.save(task);
        return "redirect:/";
    }

    @GetMapping("/task/delete/{id}")
    public String deleteTask(@PathVariable Integer id) {
        taskRepository.deleteById(id);
        return "redirect:/";
    }
}
