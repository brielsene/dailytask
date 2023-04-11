package br.com.dailytasks.controller;

import br.com.dailytasks.dto.TaskDto;
import br.com.dailytasks.orm.Task;
import br.com.dailytasks.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping
    public List<TaskDto> getAllTasks(){
        return taskService.listaTasks();
    }

    @PostMapping
    public void registrarNovaTask(@RequestBody Task task){
        taskService.cadastrar(task);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TaskDto> getById(@PathVariable("id")Long id){
        TaskDto taskDto = taskService.getById(id);
        return ResponseEntity.ok(taskDto);

    }
}
