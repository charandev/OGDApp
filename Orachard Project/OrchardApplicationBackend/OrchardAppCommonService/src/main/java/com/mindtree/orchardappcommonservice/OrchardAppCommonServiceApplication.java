package com.mindtree.orchardappcommonservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.mindtree.*"})
public class OrchardAppCommonServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrchardAppCommonServiceApplication.class, args);
	}

}
