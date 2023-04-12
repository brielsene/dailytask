package br.com.dailytasks.dto;

import br.com.dailytasks.orm.Task;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DadosAtualizaTask {
    private Long id;
    private String nome;
    private String descricao;
    private Date dataComeco;
    private Date dataFinal;

    public DadosAtualizaTask(Task task){
        DadosAtualizaTask.builder()
                .id(task.getId())
                .nome(task.getNome())
                .descricao(task.getDescricao())
                .dataComeco(task.getDataComeco())
                .dataFinal(task.getDataFinal())
                .build();
    }
}
