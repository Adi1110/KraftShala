package com.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KraftShalaApplication {

	private static final Logger logger = LogManager.getLogger(KraftShalaApplication.class.getName());
	
	public static void main(String[] args) {
		logger.debug("This is a debug message");
		logger.info("This is an info message");
		logger.warn("This is a warning message");
		logger.error("This is an error message");
		logger.fatal("This is a fatal message");
		
		SpringApplication.run(KraftShalaApplication.class, args);
	}

}
