package com.alex.exercices;

import com.alex.exercices.service.HelloWorldService;
import com.alex.exercices.service.LivreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExercicesApplication implements CommandLineRunner {

	@Autowired
	private HelloWorldService hwService;
	@Autowired
	private LivreService livreService;

	public static void main(String[] args) {
		SpringApplication.run(ExercicesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(hwService.getHelloWorld().toString());
		livreService.add();
	}
}
