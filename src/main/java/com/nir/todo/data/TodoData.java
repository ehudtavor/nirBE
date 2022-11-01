package com.nir.todo.data;

import com.nir.todo.structures.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoData extends JpaRepository<TodoEntity, Long> {}
