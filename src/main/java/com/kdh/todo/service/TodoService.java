package com.kdh.todo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kdh.todo.dto.TodoDTO;
import com.kdh.todo.mapper.TodoMapper;

@Service
public class TodoService {
    @Autowired
    private TodoMapper todoMapper;

    public List<TodoDTO> getTodoList() {
        return todoMapper.selectTodoList();
    }
}