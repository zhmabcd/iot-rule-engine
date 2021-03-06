package com.casic.iot;

import com.github.ltsopensource.spring.boot.annotation.EnableJobClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableJobClient
@ComponentScan("com.casic.iot")
public class IOTReApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(IOTReApiApplication.class, args);
	}
}
