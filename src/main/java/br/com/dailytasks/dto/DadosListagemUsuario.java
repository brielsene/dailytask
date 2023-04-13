package br.com.dailytasks.dto;

import br.com.dailytasks.orm.Task;
import br.com.dailytasks.orm.Usuario;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DadosListagemUsuario {
    private String user;
    private Date dataNascimento;
    private List<Task>tasks;

    public DadosListagemUsuario(Usuario usuario){
        this.user = usuario.getUser();
        this.dataNascimento = usuario.getDataNascimento();
        this.tasks = usuario.getTasks();
    }
}
