package br.com.dailytasks.service;

import br.com.dailytasks.dto.DadosCadastroUsuario;
import br.com.dailytasks.dto.DadosListagemUsuario;
import br.com.dailytasks.orm.Usuario;
import br.com.dailytasks.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public String cadastrarUsuario(DadosCadastroUsuario dadosCadastroUsuario){
        Usuario usuario = new Usuario(dadosCadastroUsuario);
        usuarioRepository.save(usuario);
        return dadosCadastroUsuario.getUser()+", cadastrado com sucesso";

    }

    public List<DadosListagemUsuario>listarUsuarios(){
        List<Usuario> all = usuarioRepository.findAll();
        List<DadosListagemUsuario>usuarios = new ArrayList<>();
        for (Usuario us: all
             ) {
            DadosListagemUsuario dados =new DadosListagemUsuario(us);
            usuarios.add(dados);

        }
        return usuarios;
    }
}
