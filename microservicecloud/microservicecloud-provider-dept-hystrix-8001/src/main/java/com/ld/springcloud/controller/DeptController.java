package com.ld.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ld.springcloud.entities.Dept;
import com.ld.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class DeptController {

	@Autowired
	private DeptService service;

	@RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
	@HystrixCommand(fallbackMethod = "error")
	public Dept get(@PathVariable("id") Long id) {
		Dept dept = service.get(id);
		if(dept == null) {
			throw new RuntimeException("没有查到数据");
		}
		return dept;
	}
	
	public Dept error(@PathVariable("id") Long id) {
		return new Dept(102l, "没有数据", "没有数据库");
	}

}
