package com.test.serverproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ServerproducerApplication {
	public static void main(String[] args) {
		SpringApplication.run(ServerproducerApplication.class, args);
	}
}
