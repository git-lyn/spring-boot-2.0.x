package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @program: spring-boot-build
 * @author: lyn
 * * @create: 2020-04-03 23:40
 **/
@SpringBootApplication
public class MainApplication //extends SpringBootServletInitializer
{

	/**
	 * 通过打war包的方式运行项目
	 * @param builder a builder for the application context
	 * @return
	 */
	//@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//		return super.configure(builder).sources(MainApplication.class);
//	}

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class);
	}
}
