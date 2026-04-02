package com.kdh.todo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.kdh.todo.dto.TodoDTO;

@Mapper
public interface TodoMapper {
    // 1. 전체 할 일 목록 조회
    List<TodoDTO> selectTodoList();
    
    // 2. 목표 등록 (처음 할 일 만들 때)
    int insertTodo(TodoDTO todo);

    // 3. [핵심] 성과 기록 및 완료 처리 ('Y'로 자동 업데이트)
    int updateTodoComplete(TodoDTO todo); 
}