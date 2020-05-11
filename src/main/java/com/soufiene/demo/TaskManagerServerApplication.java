package com.soufiene.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.soufiene"})
public class TaskManagerServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskManagerServerApplication.class, args);
	}

}
