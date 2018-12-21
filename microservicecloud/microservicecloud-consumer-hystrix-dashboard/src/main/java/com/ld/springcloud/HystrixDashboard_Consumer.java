package com.ld.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboard_Consumer {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(HystrixDashboard_Consumer.class, args);
	}

}
