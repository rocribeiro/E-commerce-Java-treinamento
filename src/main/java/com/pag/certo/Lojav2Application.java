package com.pag.certo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@ComponentScan(basePackages="com.pag.certo")
public class Lojav2Application {

	public static void main(String[] args) {
		SpringApplication.run(Lojav2Application.class, args);
	}

}

