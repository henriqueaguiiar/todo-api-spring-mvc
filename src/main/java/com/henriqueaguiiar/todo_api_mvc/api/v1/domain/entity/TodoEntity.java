package com.henriqueaguiiar.todo_api_mvc.api.v1.domain.entity;


import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_todo")
public class TodoEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "description")
    private String description;
    @Column(name = "fl_concluido")
    private Boolean concluido;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getConcluido() {
        return concluido;
    }

    public void setConcluido(Boolean concluido) {
        this.concluido = concluido;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TodoEntity that = (TodoEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(description, that.description) && Objects.equals(concluido, that.concluido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, concluido);
    }

}
