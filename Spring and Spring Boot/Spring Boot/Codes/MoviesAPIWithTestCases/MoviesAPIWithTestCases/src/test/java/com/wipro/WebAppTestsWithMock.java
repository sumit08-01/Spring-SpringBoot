package com.wipro;

import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

import com.fasterxml.jackson.databind.ObjectMapper;

//instead of starting the server on a random port and then test it
//if you want to test the layer below that, where spring handles
//incoming HTTP request and hands it off to the controller, without
//the cost of starting the server, you can use Spring's MockMvc and ask 
//for that to be injected for you by using @AutoConfigureMockMvc annotation 
//on the test case

@SpringBootTest
@AutoConfigureMockMvc
public class WebAppTestsWithMock {
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void moviePost() throws Exception {
		mockMvc.perform( MockMvcRequestBuilders
			      .post("/")
			      .content(asJsonString(new Movie("M004", "Cast Away", 90000)))
			      .contentType(MediaType.APPLICATION_JSON)
			      .accept(MediaType.APPLICATION_JSON))
			      .andExpect(status().isCreated());
			      
		
	}
	public static String asJsonString(final Object obj) {
	    try {
	        return new ObjectMapper().writeValueAsString(obj);
	    } catch (Exception e) {
	        throw new RuntimeException(e);
	    }
	}
				
		
				
	}

	
	

