package com.ld.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 配置类
 * @author ld
 *
 */
@Configuration
public class ConfigBean {

	@Bean
	@LoadBalanced  //负载均衡
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
