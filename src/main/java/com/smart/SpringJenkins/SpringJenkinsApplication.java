package com.smart.SpringJenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {
	
	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);

	public static void main(String[] args) {
		logger.info("Springboot application has started");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
