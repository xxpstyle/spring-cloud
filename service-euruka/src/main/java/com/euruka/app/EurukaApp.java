package com.euruka.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * 
 *  @author wangshang
 * 	@date 2018年6月29日/上午9:53:30  
 * 	@类作用: app启动类  搭建服务 实现服务注册
 */
@SpringBootApplication
@EnableEurekaServer 
public class EurukaApp {

	public static void main(String[] args) {
		
		SpringApplication.run(EurukaApp.class, args);
	}
}
