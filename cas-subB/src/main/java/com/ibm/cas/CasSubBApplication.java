package com.ibm.cas;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class CasSubBApplication {

	public static void main(String[] args) {
		SpringApplication.run(CasSubBApplication.class, args);
	}
}
