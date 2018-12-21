package com.ld.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ld.springcloud.entities.Dept;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class DeptController_Consumer {

	private static final String REST_URL_PREFIX = "http://MICROSERVICECLOUD-DEPT";
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping(value="/consumer/dept/get/{id}")
	@HystrixCommand(fallbackMethod = "error")
	public Dept get(@PathVariable("id") Long id) {
		
		Dept dept = restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+id, Dept.class);
		if(dept == null) {
			throw new RuntimeException("没有数据");
		}
		return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+id, Dept.class);
	}
	
	public Dept error(@PathVariable("id") Long id) {
		return new Dept(101l, "错误", "不属于哪个数据库");
	}
	
}
