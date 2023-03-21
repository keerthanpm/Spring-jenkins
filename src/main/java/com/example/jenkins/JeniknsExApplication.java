package com.example.jenkins;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.classic.Logger;
import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class JeniknsExApplication {

	private static org.slf4j.Logger logger = LoggerFactory.getLogger(JeniknsExApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("Application started");
	}
	public static void main(String[] args) {
		logger.info("application executed");
		SpringApplication.run(JeniknsExApplication.class, args);
		
		
	}

}
