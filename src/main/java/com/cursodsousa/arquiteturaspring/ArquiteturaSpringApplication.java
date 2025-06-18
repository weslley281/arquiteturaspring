package com.cursodsousa.arquiteturaspring;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ArquiteturaSpringApplication {

	public static void main(String[] args) {
		//SpringApplication.run(ArquiteturaSpringApplication.class, args);

		SpringApplicationBuilder builder = new SpringApplicationBuilder(ArquiteturaSpringApplication.class);

		ConfigurableApplicationContext applicationContext = builder.context();
		//applicationContext.getBean("");

		builder.bannerMode(Banner.Mode.OFF);
		builder.run(args);
	}

}
