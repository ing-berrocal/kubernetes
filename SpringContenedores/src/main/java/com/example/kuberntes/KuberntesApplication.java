package com.example.kuberntes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class KuberntesApplication {

	public static void main(String[] args) {
		SpringApplication.run(KuberntesApplication.class, args);
	}

}
