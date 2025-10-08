package com.henriqueaguiiar.todo_api_mvc.api.v1.domain.repository;

import com.henriqueaguiiar.todo_api_mvc.api.v1.domain.entity.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<TodoEntity, Integer> {

    boolean existsByDescricao(String descricao);

}
