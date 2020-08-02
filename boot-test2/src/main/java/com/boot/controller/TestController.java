package com.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: spring-boot-build
 * @author: lyn
 * * @create: 2020-07-29 22:43
 **/
@Controller
public class TestController {


	@RequestMapping("/test")
	@ResponseBody
	public Object test(){
		Map<String, String> map = new HashMap<>();
		map.put("11", "22222");
		System.out.println("dsfsdfsdff");
		return map;
	}

}
