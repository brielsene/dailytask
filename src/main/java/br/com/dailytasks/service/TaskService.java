package br.com.dailytasks.service;

import br.com.dailytasks.dto.TaskDto;
import br.com.dailytasks.orm.Task;
import br.com.dailytasks.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.List;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;



    public List<TaskDto>listaTasks(){
        List<Task> tasks = taskRepository.findAll();
        return TaskDto.convert(tasks);
    }

    public void cadastrar(TaskDto taskDto){
        Task task = new Task(taskDto);
        taskRepository.save(task);
    }
}
