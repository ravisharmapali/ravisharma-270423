package com.avisys.cim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomerInfoManagementApplication {

	public static void main(String[] args) {
		System.out.println("inside main method");
		SpringApplication.run(CustomerInfoManagementApplication.class, args);
	}

}
