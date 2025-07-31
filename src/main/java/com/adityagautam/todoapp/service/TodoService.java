package com.adityagautam.todoapp.service;

import com.adityagautam.todoapp.model.Todo;
import com.adityagautam.todoapp.repo.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class TodoService {
    @Autowired
    private TodoRepo repo;
    public void save(Todo t) {
        repo.save(t);
    }

    public List<Todo> findAll() {
        return repo.findAll();
    }

    public void deleteTodo(long id) {
        if (!repo.existsById(id)) {
            throw new RuntimeException("Todo not found with id: " + id);
        }
        repo.deleteById(id);
    }

    public Todo update(long id) {
        Optional<Todo> optionalTodo = repo.findById(id);

        if (optionalTodo.isPresent()) {
            Todo temp = optionalTodo.get();
            temp.setCompleted(!temp.getCompleted());
            return repo.save(temp);
        } else {
            throw new RuntimeException("Todo not found with id: " + id);
        }
    }
}
