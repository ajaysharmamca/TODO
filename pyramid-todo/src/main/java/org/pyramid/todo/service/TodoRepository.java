package org.pyramid.todo.service;

import java.util.List;

import org.pyramid.todo.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Integer>{
	List<Todo> findByUser(String user);
}
