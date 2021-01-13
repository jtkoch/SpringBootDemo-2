package com.galaxe.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

	@Bean
	CommandLineRunner commandLineRunner(StudentRepository repository) {
		return args -> {
			Student johnny = new Student(
				1L,
				"Johnny", 
				"johnny.brown@gmail.com",
				LocalDate.of(1995,  12,  18)
			);
			Student alex = new Student(
					"Alex", 
					"alex@gmail.com",
					LocalDate.of(1994,  12,  18)
			);
			
			repository.saveAll(List.of(johnny, alex));
		};
	}
}
