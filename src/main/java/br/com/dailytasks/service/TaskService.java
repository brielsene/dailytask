package br.com.dailytasks.service;

import br.com.dailytasks.dto.DadosCadastroTask;
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
}




