package com.wipro;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;

//starting the application and listen for a connection like how
//an app would do in a production environment
//webEnvironment.RANDOM_PORT is used to start the server on a random port
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
public class HTTPTests {
	
	//the random port is injected into a variable by using
	//the below @LocalServerPort annotation
	@LocalServerPort
	private int port;
	
	//Spring boot automatically provides a TestRestTemplate
	//which is a RESTClient to make REST calls
	@Autowired
	private TestRestTemplate restTemplate;
	
	@Test
	public void movieGetByMovieIdTest() throws Exception
	{
		//assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/M001", Movie.class)).hasFieldOrProperty("movieName");
		
		assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/M001", Movie.class).getMovieCollection()).isEqualTo(10000);
	}
}
