package com.projetoListaCompras.listComprasSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class ListComprasSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ListComprasSpringApplication.class, args);
	}

}
