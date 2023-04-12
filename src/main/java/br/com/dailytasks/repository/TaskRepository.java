package br.com.dailytasks.repository;

import br.com.dailytasks.dto.DadosCadastroTask;
import br.com.dailytasks.orm.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TaskRepository extends JpaRepository<Task, Long> {


}
