package br.com.dailytasks.controller;

import br.com.dailytasks.dto.DadosCadastroUsuario;
import br.com.dailytasks.dto.DadosListagemUsuario;
import br.com.dailytasks.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<String> cadastrarUsuario(@RequestBody DadosCadastroUsuario dadosCadastroUsuario){
        return new ResponseEntity<>(usuarioService.cadastrarUsuario(dadosCadastroUsuario), HttpStatus.CREATED) ;
    }

    @GetMapping
    public ResponseEntity<List<DadosListagemUsuario>>listarUsuarios(){
        return ResponseEntity.ok(usuarioService.listarUsuarios());
    }

}
