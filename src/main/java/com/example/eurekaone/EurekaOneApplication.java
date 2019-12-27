package com.example.eurekaone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaOneApplication.class, args);
	}

}
