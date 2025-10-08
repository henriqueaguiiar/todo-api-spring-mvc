package com.henriqueaguiiar.todo_api_mvc.api.v1.domain.services;


import com.henriqueaguiiar.todo_api_mvc.api.v1.domain.entity.TodoEntity;
import com.henriqueaguiiar.todo_api_mvc.api.v1.domain.repository.TodoRepository;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    private TodoRepository todoRepository;
    private TodoValidator todoValidator;
    private  MailSender mailSender;


    public TodoService(TodoRepository todoRepository, TodoValidator todoValidator, MailSender mailSender) {
        this.todoRepository = todoRepository;
        this.todoValidator = todoValidator;
        this.mailSender = mailSender;
    }

    public TodoEntity save(TodoEntity novoTodo){
        todoValidator.validar(novoTodo);
        todoRepository.save(novoTodo);
        return novoTodo;
    }

    public void atualizarStatus(TodoEntity todo){
        todoRepository.save(todo);
        String status  = todo.getConcluido() == Boolean.TRUE ? "Concluido" : "Não concluido";
        mailSender.enviar("Todo " + todo.getDescription() + "foi atualizado para " + status);
    }

    public TodoEntity getbyId(Integer id){
        return todoRepository.findById(id).orElse(null);
    }


}
