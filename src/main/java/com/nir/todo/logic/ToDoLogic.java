package com.nir.todo.logic;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nir.todo.data.TodoData;
import com.nir.todo.structures.TodoEntity;

@CrossOrigin
@RestController
public class ToDoLogic {
  private final TodoData repository;

  ToDoLogic(TodoData repository) {
    this.repository = repository;
  }

  @GetMapping("/todo/all")
  List<TodoEntity> all() {
    return repository.findAll();
  }

  @PostMapping("/todo")
  TodoEntity saveTodo(@RequestBody TodoEntity todoEntity) {
    System.out.println(todoEntity.toString());
    return repository.save(todoEntity);
  }
}
