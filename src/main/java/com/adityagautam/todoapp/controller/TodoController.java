package com.adityagautam.todoapp.controller;

import com.adityagautam.todoapp.model.Todo;
import com.adityagautam.todoapp.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("api/todos")
public class TodoController {
    @Autowired
    private TodoService service;

    @PostMapping
    public void saveTodo(@RequestBody Todo t){
        service.save(t);
    }

    @GetMapping
    public List<Todo> showAll(){
        return service.findAll();
    }

    @PutMapping("/{id}")
    public Todo changeCompleted(@PathVariable long id){
        return service.update(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
        service.deleteTodo(id);
    }

}

