package com.henriqueaguiiar.todo_api_mvc.api.v1.resources;


import com.henriqueaguiiar.todo_api_mvc.api.v1.domain.entity.TodoEntity;
import com.henriqueaguiiar.todo_api_mvc.api.v1.domain.services.TodoService;
import org.springframework.web.bind.annotation.*;

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

    @PutMapping("{id}")
    public void atualizar(@PathVariable("id") Integer id, @RequestBody TodoEntity todo){
        todo.setId(id);
        this.todoService.atualizarStatus(todo);
    }

    @GetMapping("{id}")
    public TodoEntity getTodo(@PathVariable("id") Integer id){
        return this.todoService.getbyId(id);
    }

}
