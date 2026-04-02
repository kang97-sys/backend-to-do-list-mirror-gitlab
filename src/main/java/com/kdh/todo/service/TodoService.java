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

    // 1. 전체 목록 조회
    public List<TodoDTO> getTodoList() {
        return todoMapper.selectTodoList();
    }

    // 2. 목표 등록
    public int addTodo(TodoDTO todo) {
        return todoMapper.insertTodo(todo);
    }

    // 3. 성과 기록
    public int modifyTodoComplete(TodoDTO todo) {
        return todoMapper.updateTodoComplete(todo);
    }
}