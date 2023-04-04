package br.com.dailytasks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "br.com.dailytasks.orm")
public class DailytasksApplication {

	public static void main(String[] args) {
		SpringApplication.run(DailytasksApplication.class, args);
	}

}
