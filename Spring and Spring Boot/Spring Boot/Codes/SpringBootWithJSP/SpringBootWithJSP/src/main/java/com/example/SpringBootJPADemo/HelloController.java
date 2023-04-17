package com.example.SpringBootJPADemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping("/hello")
	public String Hello()
	{
		return "hello"; //logical view name
	}


}
