package com.henriqueaguiiar.todo_api_mvc.api.v1.domain.services;


import com.henriqueaguiiar.todo_api_mvc.api.v1.domain.entity.TodoEntity;
import com.henriqueaguiiar.todo_api_mvc.api.v1.domain.repository.TodoRepository;
import org.springframework.stereotype.Component;

@Component
public class TodoValidator {

    private TodoRepository todoRepository;

    public TodoValidator(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public void validar(TodoEntity todo){
        if(existeTodoDesc(todo.getDescription())){
            throw new IllegalArgumentException("Ja existe um TOdo com esta descrição");
        }
    }

    private boolean existeTodoDesc(String descricao){
       return todoRepository.existsByDescricao(descricao);
    }

}
