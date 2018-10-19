package com.piggymetrics.jwt.service.impl;

import com.piggymetrics.jwt.entity.Todo;
import com.piggymetrics.jwt.exception.BizException;
import com.piggymetrics.jwt.repository.TodoRepository;
import com.piggymetrics.jwt.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class TodoServiceImpl implements TodoService {

    private final TodoRepository repository;

    @Autowired
    TodoServiceImpl(TodoRepository repository) {
        this.repository = repository;
    }

    @Override
    public Todo addTodo(Todo todo) {
        return repository.insert(todo);
    }

    @Override
    public Todo deleteTodo(String id) throws BizException {
        Optional<Todo> optional = repository.findById(id);
        if(!optional.isPresent()) {
            throw new BizException("The ID which will be deleted does not exist. ");
        }
        repository.deleteById(id);
        return optional.get();
    }

    @Override
    public List<Todo> findAll(String username) {
        return repository.findByUserUsername(username);
    }

    @Override
    public Todo findById(String id) throws BizException {
        Optional<Todo> optional = repository.findById(id);
        if(!optional.isPresent()) {
            throw new BizException("The ID which will be deleted does not exist. ");
        }
        return optional.get();
    }

    @Override
    public Todo update(Todo todo) {
        repository.save(todo);
        return todo;
    }
}
