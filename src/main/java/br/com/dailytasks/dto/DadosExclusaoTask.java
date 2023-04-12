package br.com.dailytasks.dto;

import br.com.dailytasks.orm.Task;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DadosExclusaoTask {
    private Long id;
    private String nome;

    public DadosExclusaoTask(Task task){
        this.id = task.getId();
        this.nome = task.getNome();
    }
}
