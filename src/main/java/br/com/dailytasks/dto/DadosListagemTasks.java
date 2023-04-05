package br.com.dailytasks.dto;

import java.util.Date;

public record DadosListagemTasks(String nome, String descricao) {

    public DadosListagemTasks(TaskDto taskDto){
        this(taskDto.getNome(), taskDto.getDescricao());
    }

}
