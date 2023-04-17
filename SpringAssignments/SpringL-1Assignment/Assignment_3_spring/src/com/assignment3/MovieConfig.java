package com.assignment3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MovieConfig {

	@Bean
	public Movie getMovie() {
		return new Movie();
		
	}
}
