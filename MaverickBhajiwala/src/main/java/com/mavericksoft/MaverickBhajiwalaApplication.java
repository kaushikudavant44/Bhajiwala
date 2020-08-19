package com.mavericksoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class MaverickBhajiwalaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MaverickBhajiwalaApplication.class, args);
	}

}
