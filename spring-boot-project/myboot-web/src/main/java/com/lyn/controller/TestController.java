package com.lyn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: spring-boot-build
 * @author: lyn
 * * @create: 2020-07-30 13:37
 **/
@Controller
public class TestController {

	@RequestMapping("/test")
	public String test(){

		return "test";
	}

}
