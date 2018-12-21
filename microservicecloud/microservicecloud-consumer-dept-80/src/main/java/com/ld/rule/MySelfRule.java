package com.ld.rule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

/**
 *  
 * @author administrator-pc
 *  自定义负载均衡规则
 */
@Configuration
public class MySelfRule {

	@Bean
	public IRule getIRule() {
		//自定义为随机规则，默认为轮询
//		return new RandomRule();
		return new RandomRule_LD();
	}
}
