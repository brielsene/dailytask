package br.com.dailytasks.service;

import br.com.dailytasks.dto.TaskDto;
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



    public List<TaskDto> listaTasks(){
        //ordenando
        Sort sort = Sort.by("data").descending();
        Pageable pageable = PageRequest.of(0, 2);
        List<Task> tasks = taskRepository.findAll(sort);
        return TaskDto.convert(tasks);
    }

    public void cadastrar(TaskDto taskDto){
        Task task = new Task(taskDto);
        taskRepository.save(task);
    }

    public TaskDto getById(Long id){
        Optional<Task> byId = taskRepository.findById(id);
        if(byId.isPresent()){
            Task task = byId.get();
            TaskDto taskDto = new TaskDto(task);
            return taskDto;
        }else{
            return null;
        }
    }
}
