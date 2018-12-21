package com.ld.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class DeptConsumer80hystrix_App {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(DeptConsumer80hystrix_App.class, args);
	}

}
