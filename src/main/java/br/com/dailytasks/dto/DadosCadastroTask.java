package br.com.dailytasks.dto;



import br.com.dailytasks.orm.Task;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DadosCadastroTask {
    private String nome;
    private String descricao;
    private Date dataComeco;
    private Date dataFinal;


}
