package br.com.dailytasks;

import br.com.dailytasks.dto.DadosCadastroTask;
import br.com.dailytasks.repository.TaskRepository;
import br.com.dailytasks.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

@SpringBootApplication
@EntityScan(basePackages = "br.com.dailytasks.orm")
public class DailytasksApplication  {
	@Autowired
	private TaskRepository taskRepository;
	private Scanner  scanner = new Scanner(System.in);

	public static void main(String[] args) {
		SpringApplication.run(DailytasksApplication.class, args);
	}


}
