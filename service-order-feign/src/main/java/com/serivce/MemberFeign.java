package com.serivce;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 *  @author wangshang
 * 	@date 2018年7月1日/下午7:33:03  
 * 	@类作用:编写service,调用service-member
 * Feign默认集成了Ribbon，并和Eureka结合，默认实现了负载均衡的效果。
 */
//@FeignClient 需要调用服务名称，@RequestMapping服务请求名称
@FeignClient("service-member")
@RestController
public interface MemberFeign {
	@RequestMapping("/getUserList")
	public List<String> getOrderByUserList();
}
