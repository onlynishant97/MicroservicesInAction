package com.spring.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@RefreshScope
@EnableEurekaClient
public class UserMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserMicroServiceApplication.class, args);
	}

}
