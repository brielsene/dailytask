package br.com.dailytasks.service;

import br.com.dailytasks.dto.DadosAtualizaTask;
import br.com.dailytasks.dto.DadosCadastroTask;
import br.com.dailytasks.dto.DadosExclusaoTask;
import br.com.dailytasks.dto.TaskDto;
import br.com.dailytasks.exception.TaskUnavailableException;
import br.com.dailytasks.orm.Task;
import br.com.dailytasks.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;


    public List<TaskDto> listaTasks() {
        //ordenando
//        Sort sort = Sort.by("data").descending();
//        Pageable pageable = PageRequest.of(0, 2);
        List<Task> tasks = taskRepository.findAll();
        return TaskDto.convert(tasks);
    }

    public String cadastraNovaTask(DadosCadastroTask dadosCadastroTask) {
        Task task = new Task(dadosCadastroTask);
        taskRepository.save(task);
        return dadosCadastroTask.getNome() + ", Cadastrado com sucesso";
    }

    public String excluirTask(Long id){
        Optional<Task> byId = taskRepository.findById(id);
        if(byId.isPresent()){
            DadosExclusaoTask dadosExclusaoTask = new DadosExclusaoTask(byId.get());
            taskRepository.deleteById(dadosExclusaoTask.getId());
            return dadosExclusaoTask.getNome()+",Deletado com sucesso";
        }else{
            return "Tarefa com id: "+id+" não existe";
        }

    }

    public String atualizaTask (Long id, DadosCadastroTask dadosCadastroTask){
        Optional<Task> byId = taskRepository.findById(id);

        if(byId.isPresent()){
            System.out.println(byId.get().getId());
            DadosAtualizaTask dadosAtualizaTask = new DadosAtualizaTask();
            dadosAtualizaTask.setId(byId.get().getId());
            dadosAtualizaTask.setNome(dadosCadastroTask.getNome());
            System.out.println(dadosAtualizaTask.getNome());
            dadosAtualizaTask.setDescricao(dadosCadastroTask.getDescricao());
            dadosAtualizaTask.setDataComeco(dadosCadastroTask.getDataComeco());
            dadosAtualizaTask.setDataFinal(dadosCadastroTask.getDataFinal());
            Task task = new Task(dadosAtualizaTask);
            taskRepository.save(task);
            return "Task de ID: "+dadosAtualizaTask.getId()+", Atualizada com sucesso";

        }else{
            return("Task com ID: "+id+" não existe!");
        }
    }
}




