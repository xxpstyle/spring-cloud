package com.itmayiedu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
/**
 * 
 *  @author wangshang
 * 	@date 2018年6月29日/下午2:16:21  
 * 	@类作用:编写service,调用service-member
 */
@Service
public class OrderMemberService {
	@Autowired
	private RestTemplate restTemplate;

	public List<String> getOrderUserAll() {
	//调用service-member
	return restTemplate.getForObject("http://service-member/getUserList", List.class);
	}

}
