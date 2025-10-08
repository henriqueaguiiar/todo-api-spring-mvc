package com.henriqueaguiiar.todo_api_mvc.api.v1.resources;


import com.henriqueaguiiar.todo_api_mvc.api.v1.domain.entity.TodoEntity;
import com.henriqueaguiiar.todo_api_mvc.api.v1.domain.services.TodoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todos")
public class TodoController {


    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping
    public TodoEntity salvar(@RequestBody TodoEntity todo){
       return this.todoService.save(todo);
    }

}
