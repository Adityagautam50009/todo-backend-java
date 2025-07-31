package com.adityagautam.todoapp;

import com.adityagautam.todoapp.model.Todo;
import com.adityagautam.todoapp.repo.TodoRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TodoappApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(TodoappApplication.class, args);
//		TodoRepo repo = context.getBean(TodoRepo.class);
//		Todo t1 = context.getBean(Todo.class);
//		t1.setCompleted(false);
//		t1.setTitle("Run errands");
//		repo.save(t1);
	}

}
