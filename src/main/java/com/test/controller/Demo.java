package com.test.controller;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;

//@SpringBootApplication
@SpringBootApplication(scanBasePackages={"com.test.controller", "com.test.service", "com.test.dao"})
@MapperScan("com.test.dao")
public class Demo implements EmbeddedServletContainerCustomizer{
	
	public static void main(String[] args) {
		
		SpringApplication.run(Demo.class, args);
		
	}

	@Override
	public void customize(ConfigurableEmbeddedServletContainer container) {
		container.setPort(8081);
	}

}
