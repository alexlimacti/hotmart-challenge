package com.hotmartchallenger.exception;

import lombok.Getter;

@Getter
public enum ProblemType {

    INVALID_DATA("Dados inválidos"),
    SYSTEM_ERROR("Erro de sistema"),
    INVALID_PARAMETER("Parâmetro inválido"),
    INCOMPREHENSIBLE_MESSAGE("Mensagem incompreensível"),
    RESOURCE_NOT_FOUND("Recurso não encontrado"),
    ENTITY_IN_USE("Entidade em uso");

    private String title;

    ProblemType(String title) {
        this.title = title;
    }

}
