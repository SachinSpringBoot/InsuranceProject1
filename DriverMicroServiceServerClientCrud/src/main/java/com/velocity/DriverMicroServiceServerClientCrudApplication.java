package com.velocity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class DriverMicroServiceServerClientCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(DriverMicroServiceServerClientCrudApplication.class, args);
	}

}
