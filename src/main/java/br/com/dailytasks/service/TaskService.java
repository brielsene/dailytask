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


//implementar funcionalidade de verificação de horários iguais
    public String cadastrar(Task task){
        List<Task> all = taskRepository.findAll();
        for (Task tasks: all
             ) {
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
            String dataTaskNova = sdf.format(task.getData());
            String dataAllTasks = sdf.format(tasks.getData());

            System.out.println("***************** "+dataAllTasks+" and "+dataTaskNova);


            if(dataTaskNova.equals(dataAllTasks)){
                return "essa data já tem atividade a ser feita";
            }

        }
        ;
        taskRepository.save(task);
        return "Atividade: "+task.getNome()+", cadastrada com sucesso";
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
