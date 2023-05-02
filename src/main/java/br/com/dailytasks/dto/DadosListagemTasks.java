package br.com.dailytasks.dto;

import br.com.dailytasks.orm.Task;

import java.util.Date;

public record DadosListagemTasks(String nome, String descricao) {

    public DadosListagemTasks(TaskDto taskDto){
        this(taskDto.getNome(), taskDto.getDescricao());
    }

    public DadosListagemTasks(Task task){
        this(task.getNome(), task.getDescricao());
    }

}
