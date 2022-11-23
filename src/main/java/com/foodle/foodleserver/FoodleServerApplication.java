package com.foodle.foodleserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class FoodleServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodleServerApplication.class, args);
	}

}
