package br.com.dailytasks.dto;

import br.com.dailytasks.orm.Usuario;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class DadosCadastroUsuario {
    private String user;
    private String senha;
    private Date dataNascimento;

    public DadosCadastroUsuario(Usuario usuario){
        this.user = usuario.getUser();
        this.user = usuario.getSenha();
        this.dataNascimento= usuario.getDataNascimento();
    }
}
