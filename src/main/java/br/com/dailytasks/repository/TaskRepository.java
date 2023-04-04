package br.com.dailytasks.repository;

import br.com.dailytasks.orm.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
