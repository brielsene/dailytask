package br.com.dailytasks.dto;

import br.com.dailytasks.orm.Task;
import br.com.dailytasks.orm.Usuario;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TaskDto {
    private Long id;
    private String nome;
    private String descricao;
    private Date dataComeco;
    private Date dataFinal;

    private Usuario usuario;

    public TaskDto(Task task){
        this.id = task.getId();
        this.nome = task.getNome();
        this.descricao = task.getDescricao();
        this.dataComeco = task.getDataComeco();
        this.dataFinal = task.getDataFinal();
        this.usuario = task.getUsuario();

    }

    public static List<TaskDto>convert(List<Task> tasks){
        return tasks.stream().map(TaskDto::new).collect(Collectors.toList());
    }
}
