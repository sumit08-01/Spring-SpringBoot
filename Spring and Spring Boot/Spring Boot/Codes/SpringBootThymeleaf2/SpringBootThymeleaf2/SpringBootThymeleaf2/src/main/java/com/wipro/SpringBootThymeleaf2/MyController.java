package com.wipro.SpringBootThymeleaf2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	@RequestMapping(value="/hello" , method=RequestMethod.GET)
	public String sayHello()
	{
		return "hello"; //templates/hello.html-
	}
	
	//data is being sent from the controller  to the view using the ModelAndView object
	@RequestMapping("/movie")
	public ModelAndView getMovies()
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("movieName", "Top Gun"); //adding data into the model
		mv.addObject("movieActor","Tom Cruise"); //adding data into the model
		mv.addObject("movieName", "f&F");
		mv.addObject("movieActor", "Vine Diesal");
		mv.setViewName("movie"); //adding the logical view name which can display the model data. Thymeleaf maps it to movie.html
		return mv;
	}
	
	//the player info is received from index.html page --> controller --> player info is sent to the player.html 
	//@RequestMapping(value="/player", method=RequestMethod.POST)
	@PostMapping("/player")
	public String postPlayer(@ModelAttribute("player") String player)
	{		
		return "player"; //player.html
	}
}

















