package com.euruka.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 *  @author wangshang
 * 	@date 2018年6月29日/上午10:40:48  
 * 	@类作用:创建一个服务提供者 会员服务工程 (eurekaMember),提供会员查询服务信息
 * application.yml下:
 * 需要指明spring.application.name,这个很重要，
 * 这在以后的服务与服务之间相互调用一般都是根据这个name 。 
 * 
 */
@RestController
public class MemberController {
	
	@Value("${server.port}")
	private String serverport;
	@RequestMapping("/getUserList")
	public List<String> getUserList() {
		
		List<String> listUser = new ArrayList<String>();
		listUser.add("zhangsan");
		listUser.add("lisi");
		listUser.add("yushengjun");
		listUser.add("server:port"+serverport);
		return listUser;
	}
	
	@RequestMapping("/getMemberApi")
	public String getMemberApi() {
		return "This is getMemberApi";
	}
	
}
