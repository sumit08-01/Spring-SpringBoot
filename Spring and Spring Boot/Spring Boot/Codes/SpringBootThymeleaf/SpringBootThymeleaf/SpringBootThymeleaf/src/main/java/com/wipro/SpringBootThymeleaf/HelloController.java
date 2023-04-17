package com.wipro.SpringBootThymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@RequestMapping("/name")
	public String displayName()
	{
		return "name"; //logical view name. Thymeleaf view resolver should resolve this to physical view name. 
								//src/main/resources/templates/hello.html 
	}
	
	@RequestMapping("/city") //taking to that mapping page
//	@ResponseBody    --->>it return data if uncomment
	public String displayCity()
	{
		return "city"; 
	}
	
}
