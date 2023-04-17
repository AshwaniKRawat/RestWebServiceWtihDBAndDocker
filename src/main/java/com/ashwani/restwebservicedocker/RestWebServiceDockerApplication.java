package com.ashwani.restwebservicedocker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class RestWebServiceDockerApplication {
	private final static Logger LOGGER = LoggerFactory.getLogger(RestWebServiceDockerApplication.class);
	public static void main(String[] args) {
		LOGGER.info("RestWebServiceDockerApplication  Applicatis is started...");
		SpringApplication.run(RestWebServiceDockerApplication.class, args);
	}

}
