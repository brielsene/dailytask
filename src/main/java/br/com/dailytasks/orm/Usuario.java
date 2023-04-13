package br.com.dailytasks.orm;

import br.com.dailytasks.dto.DadosCadastroUsuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "usuario")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
    @Id
    private String user;
    private String senha;
    @Column(name = "data_nascimento")
    private Date dataNascimento;
    @OneToMany(mappedBy = "usuario")
    private List<Task>tasks;

    public Usuario(DadosCadastroUsuario dadosCadastroUsuario){
        this.user = dadosCadastroUsuario.getUser();
        this.senha = dadosCadastroUsuario.getSenha();
        this.dataNascimento = dadosCadastroUsuario.getDataNascimento();
    }

}
