package com.youyou.kading;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.youyou")
@EnableScheduling
public class KadingApplication {

	public static void main(String[] args) {
		SpringApplication.run(KadingApplication.class, args);
	}
}
