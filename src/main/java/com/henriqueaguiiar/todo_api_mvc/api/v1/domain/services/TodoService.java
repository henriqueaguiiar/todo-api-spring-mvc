package com.henriqueaguiiar.todo_api_mvc.api.v1.domain.services;


import com.henriqueaguiiar.todo_api_mvc.api.v1.domain.entity.TodoEntity;
import com.henriqueaguiiar.todo_api_mvc.api.v1.domain.repository.TodoRepository;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    private TodoRepository todoRepository;


    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public TodoEntity save(TodoEntity novoTodo){
        todoRepository.save(novoTodo);
        return novoTodo;
    }
}
