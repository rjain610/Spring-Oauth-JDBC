package com.rahul.oauth.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication	
@ComponentScan(basePackages = "com.rahul") // very important
@EntityScan( basePackages = {"com.rahul.oauth.model"} ) // very very important 
public class OAuthServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OAuthServerApplication.class, args);
	}
	
	@RequestMapping(value = "test")
	private String test() {
		return "true";
	}
}
