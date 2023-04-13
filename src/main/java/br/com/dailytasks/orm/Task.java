package br.com.dailytasks.orm;

import br.com.dailytasks.dto.DadosAtualizaTask;
import br.com.dailytasks.dto.DadosCadastroTask;
import br.com.dailytasks.dto.TaskDto;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "task")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    @Column(name = "data_comeco")
    private Date dataComeco;
    @Column(name = "data_final")
    private Date dataFinal;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;



    //Construtor para receber DTO de cadastro
    public Task(DadosCadastroTask dadosCadastroTask){
        this.nome = dadosCadastroTask.getNome();
        this.descricao = dadosCadastroTask.getDescricao();
        this.dataComeco = dadosCadastroTask.getDataComeco();
        this.dataFinal = dadosCadastroTask.getDataFinal();
    }

    public Task(DadosAtualizaTask dadosAtualizaTask){
        this.id = dadosAtualizaTask.getId();
        this.nome = dadosAtualizaTask.getNome();
        this.descricao = dadosAtualizaTask.getDescricao();
        this.dataComeco = dadosAtualizaTask.getDataComeco();
        this.dataFinal = dadosAtualizaTask.getDataFinal();
    }





}
