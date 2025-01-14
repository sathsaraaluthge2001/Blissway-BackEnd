package com.blissway.blissway;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BlisswayApplication {

	//private static final Logger logger = LogManager.getLogger(BlisswayApplication.class);
	private static final Logger logger = LogManager.getLogger(BlisswayApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BlisswayApplication.class, args);
		logger.info("heyyy hi hi ");
		System.out.printf("hi");

	}

}
