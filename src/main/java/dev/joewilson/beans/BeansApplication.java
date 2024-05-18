package dev.joewilson.beans;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BeansApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeansApplication.class, args);
	}

	/**
	 * We also able to use @Bean annotation since parent of the parent of @SpringBootApplication is use @Configuration annotation
	 */
	@Bean
	CommandLineRunner commandLineRunner() {
		// this code will run after the application is running.
		// BUT if we remove this @Bean annotation, it won't work.
		return args -> {
			System.out.println("Hello 👋🏻");
		};
	}

}
