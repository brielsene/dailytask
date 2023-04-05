package br.com.dailytasks.orm;

import br.com.dailytasks.dto.TaskDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "task")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private Date data;

    public Task(TaskDto taskDto){
        this.nome = taskDto.getNome();
        this.descricao = taskDto.getDescricao();
//        this.data = taskDto.getData();
    }
}
