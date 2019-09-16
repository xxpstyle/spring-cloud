package com.euruka.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
/**
 *  @author wangshang
 * 	@date 2018年6月29日/上午10:41:48  
 * 	@类作用: app启动类   会员
 */
@SpringBootApplication 
@EnableEurekaClient //通过注解@EnableEurekaClient 表明自己是一个eurekaclient.
public class AppMember {

	public static void main(String[] args) {
		SpringApplication.run(AppMember.class, args);
	}

}