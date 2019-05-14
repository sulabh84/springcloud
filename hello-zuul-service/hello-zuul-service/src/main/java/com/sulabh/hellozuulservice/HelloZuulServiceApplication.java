package com.sulabh.hellozuulservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class HelloZuulServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloZuulServiceApplication.class, args);
	}

	@RequestMapping("/")
	public String hello(){
		return "Hello!";
	}
}
