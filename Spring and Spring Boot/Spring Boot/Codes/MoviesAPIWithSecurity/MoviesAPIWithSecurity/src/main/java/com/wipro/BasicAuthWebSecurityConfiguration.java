package com.wipro;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

//in earlier versions, we could write a WebSecurityConfigurerAdapter
//which helps in requiring the user to be authenticated prior to accessing
//any configured url, but its deprecated now.
//hence we need to do it like below

@Configuration
public class BasicAuthWebSecurityConfiguration {
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception
	{
		http
		//Cross-site request forgery disabled
		.csrf().disable()
		.authorizeRequests().anyRequest().authenticated()
		.and()
		.httpBasic();
		
		return http.build();
	}
	
	
	//in-memory authentication manager to validate
	//username and password
	
	@Bean
	public InMemoryUserDetailsManager userDetailsService()
	{
		UserDetails user= User
				.withUsername("steve")
				//NoOpPasswordEncoder
				.password("{noop}supersecret")
				.roles("USER")
				.build();
		return new InMemoryUserDetailsManager(user);
		
		
	}
	

}
