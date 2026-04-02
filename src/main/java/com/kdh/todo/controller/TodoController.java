package com.kdh.todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kdh.todo.dto.TodoDTO;
import com.kdh.todo.service.TodoService;

@RestController
@RequestMapping("/api/todo")
public class TodoController {

    @Autowired
    private TodoService todoService;

    // 1. 전체 목록 조회
    @GetMapping("/list")
    public List<TodoDTO> list() {
        return todoService.getTodoList();
    }

    // 2. 목표 등록
    @PostMapping("/add")
    public int add(@RequestBody TodoDTO todo) {
        return todoService.addTodo(todo);
    }

    // 3. 성과 기록
    @PutMapping("/complete")
    public int complete(@RequestBody TodoDTO todo) {
        return todoService.modifyTodoComplete(todo);
    }
}