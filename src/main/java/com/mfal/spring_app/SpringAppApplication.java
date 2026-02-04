package com.mfal.spring_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@SpringBootApplication

@Configuration
@EnableAutoConfiguration
@ComponentScan

@Profile("test")

public class SpringAppApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringAppApplication.class, args);
	}

}
