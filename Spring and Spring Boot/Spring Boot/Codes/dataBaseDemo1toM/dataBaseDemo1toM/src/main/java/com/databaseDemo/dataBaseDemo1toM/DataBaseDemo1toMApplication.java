package com.databaseDemo.dataBaseDemo1toM;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages="com.model")
@EntityScan(basePackages="com.model")
@EnableAutoConfiguration
@ComponentScan(basePackages="com.controller")

public class DataBaseDemo1toMApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataBaseDemo1toMApplication.class, args);
	}

}
