package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
/**
 * 
 *  @author wangshang
 * 	@date 2018年7月1日/下午9:28:26  
 * 	@类作用:
 * 	发送请求http://127.0.0.1:8769/api-member/getMemberAll 
	转发到http://127.0.0.1:8762/getMemberAll
	开启网关 @EnableZuulProxy
	
	/api-member/  这个可以随意写 
 */
@EnableEurekaClient
@SpringBootApplication
@EnableZuulProxy
public class AppZuul {

	public static void main(String[] args) {
		
		SpringApplication.run(AppZuul.class, args);
	}
}
