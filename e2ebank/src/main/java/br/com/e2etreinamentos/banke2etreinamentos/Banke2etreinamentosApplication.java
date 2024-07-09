package br.com.e2etreinamentos.banke2etreinamentos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "br.com.e2etreinamentos.banke2etreinamentos.repository")
public class Banke2etreinamentosApplication {

	public static void main(String[] args) {
		SpringApplication.run(Banke2etreinamentosApplication.class, args);
	}

}
