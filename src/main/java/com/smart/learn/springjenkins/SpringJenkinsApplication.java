package com.smart.learn.springjenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {

	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);
	
	public void init() {
		logger.info("Initiali method started");
	}
	public static void main(String[] args) {
		logger.info("Applcation has started successfully");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
