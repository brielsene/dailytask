package br.com.dailytasks.controller;

import br.com.dailytasks.dto.DadosAtualizaTask;
import br.com.dailytasks.dto.DadosCadastroTask;
import br.com.dailytasks.dto.DadosListagemTasks;
import br.com.dailytasks.dto.TaskDto;
import br.com.dailytasks.orm.Task;
import br.com.dailytasks.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping
    public ResponseEntity<List<TaskDto>> getAllTasks(){
        return ResponseEntity.ok(taskService.listaTasks());
    }

    @PostMapping
    public ResponseEntity<String> registrarNovaTask(@RequestBody DadosCadastroTask dadosCadastroTask){
        return new ResponseEntity<>(taskService.cadastraNovaTask(dadosCadastroTask), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String>atualizaTask(@PathVariable("id")Long id, @RequestBody DadosCadastroTask dadosCadastroTask){
        return new ResponseEntity<>(taskService.atualizaTask(id, dadosCadastroTask), HttpStatus.valueOf(200));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String>deleteTask(@PathVariable("id")Long id){
        return new ResponseEntity<>(taskService.excluirTask(id), HttpStatus.valueOf(200));
    }

    @GetMapping("/{id}")
    public ResponseEntity<DadosListagemTasks>listarTaskById(@PathVariable("id")Long id){
        return new ResponseEntity<>(taskService.listaTaskById(id), HttpStatus.OK);
    }


}
