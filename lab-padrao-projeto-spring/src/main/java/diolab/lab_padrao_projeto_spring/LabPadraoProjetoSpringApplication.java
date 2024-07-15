package diolab.lab_padrao_projeto_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class LabPadraoProjetoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabPadraoProjetoSpringApplication.class, args);
	}

}
