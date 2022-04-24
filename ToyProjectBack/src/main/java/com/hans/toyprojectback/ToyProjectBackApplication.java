package com.hans.toyprojectback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class ToyProjectBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(ToyProjectBackApplication.class, args);
	}

}
