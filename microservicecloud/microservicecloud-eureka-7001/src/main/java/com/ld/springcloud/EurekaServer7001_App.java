package com.ld.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer  //EurekaServer启动类，接受其他微服务注册进来
public class EurekaServer7001_App {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(EurekaServer7001_App.class, args);
	}
}
