 package com.wipro.SpringBootThymeleaf3;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {	
	List<Movie> movies=new ArrayList<Movie>();
	//data is being sent from the controller  to the view using the ModelAndView object
	
	@RequestMapping("/movie")
	//@ResponseBody
	public ModelAndView getMovies()
	{
		ModelAndView mv=new ModelAndView();
		Movie m=new Movie("TopGun","Tom Cruise");
		Movie m1=new Movie("Spiderman","Tobey Maquire");
		Movie m2=new Movie("Titanic","Leonardo Dicaprio");
		Movie m3=new Movie("Cast Away","Tom Hanks");
		Movie m4=new Movie("Avatar","Sam Worthington");
		Movie m5=new Movie("Avatar","Sam Worthington");
		movies.add(m);
		movies.add(m1);
		movies.add(m2);
		movies.add(m3);
		movies.add(m4);
		movies.add(m5);
		//mv.addAllObjects(movies);
		mv.addObject("movies",movies);
		mv.setViewName("movie");
		return mv;
	}

}

















