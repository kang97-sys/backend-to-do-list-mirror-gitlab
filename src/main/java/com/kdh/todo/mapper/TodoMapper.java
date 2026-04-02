package com.kdh.todo.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.kdh.todo.dto.TodoDTO;

@Mapper
public interface TodoMapper {
    // 1. 전체 목록 조회
    List<TodoDTO> selectTodoList();
    
    // 2. 목표 등록 (초기값 'N')
    int insertTodo(TodoDTO todo);

    // 3. 성과 기록 (달성률 반영 및 'Y' 업데이트)
    int updateTodoComplete(TodoDTO todo); 
}