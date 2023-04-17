package com.wipro;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

//@springBootTest annotation tells Spring Boot to look
//for a main configuration class(Runnable class) with @SpringBootApplication
//and use that to start Spring Application context 
@SpringBootTest
class MoviesApiApplicationTests {

	//Spring interprets the @Autowired annotation and the controller
	//is injected before the test methods are run
	@Autowired
	private MovieController movieController;	
	
	//simple sanity check test that to check if the application
	//context(containers) can start
		@Test
		void contextLoads(){
			
		}
		
	
	//simple sanity check test that to check if the application
	//context(containers) can start and that the context is
	//creating your controller, you can add an assertion
	@Test
	void ControllerLoads() throws Exception {
		//AssertJ provides the assertThat() and other methods
		//to express the test assertions
		assertThat(movieController).isNotNull();
	}
}
