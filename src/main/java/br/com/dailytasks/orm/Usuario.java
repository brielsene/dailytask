package br.com.dailytasks.orm;

import br.com.dailytasks.dto.DadosCadastroUsuario;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

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
    @Fetch(FetchMode.SUBSELECT)
    @JsonManagedReference
    private List<Task>tasks;

    public Usuario(DadosCadastroUsuario dadosCadastroUsuario){
        this.user = dadosCadastroUsuario.getUser();
        this.senha = dadosCadastroUsuario.getSenha();
        this.dataNascimento = dadosCadastroUsuario.getDataNascimento();
    }

}
