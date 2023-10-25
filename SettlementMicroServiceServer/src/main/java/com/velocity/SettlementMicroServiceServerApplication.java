package com.velocity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class SettlementMicroServiceServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SettlementMicroServiceServerApplication.class, args);
	}

}
