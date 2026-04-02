package com.kdh.todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kdh.todo.dto.TodoDTO;
import com.kdh.todo.service.TodoService;

@RestController
@RequestMapping("/api/todo") // 모든 요청 주소 앞에 /api/todo가 붙습니다.
@CrossOrigin(origins = "*") // 프론트엔드가 어디에 있든 일단 허용
public class TodoController {

    @Autowired
    private TodoService todoService;

    // 전체 할 일 목록 조회 (http://localhost:8080/api/todo/list)
    @GetMapping("/list")
    public List<TodoDTO> getTodoList() {
        return todoService.getTodoList();
    }
}