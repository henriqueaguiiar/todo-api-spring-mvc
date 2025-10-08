package com.henriqueaguiiar.todo_api_mvc.api.v1.domain.services;


import org.springframework.stereotype.Component;

@Component
public class MailSender {

    public void enviar(String mensagem){
        System.out.println("Enviado Email " + mensagem);
    }
}
