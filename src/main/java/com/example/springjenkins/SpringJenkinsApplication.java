package com.example.springjenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringJenkinsApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringJenkinsApplication.class);

	@PostConstruct
	public init() {
		LOGGER.info("SpringJenkinsApplication started...");
	}

	public static void main(String[] args) {
		LOGGER.info("SpringJenkinsApplication main method executed");
		LOGGER.info("One more logger to test jenkins pipeline");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
