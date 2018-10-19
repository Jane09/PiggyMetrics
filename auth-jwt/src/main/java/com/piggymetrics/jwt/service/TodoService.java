package com.piggymetrics.jwt.service;

import com.piggymetrics.jwt.entity.Todo;

import java.util.List;

public interface TodoService {
    Todo addTodo(Todo todo);
    Todo deleteTodo(String id);
    List<Todo> findAll(String username);
    Todo findById(String id);
    Todo update(Todo todo);
}
