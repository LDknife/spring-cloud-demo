package com.ld.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //本服务启动就会注册到eureka服务器中
@EnableDiscoveryClient //开启服务发现
public class DeptProvider8003_App {

	public static void main(String[] args) {
		SpringApplication.run(DeptProvider8003_App.class, args);
	}

}
