package com.movFlix;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.PostConstruct;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@RequestMapping("/api/movies")
public class MovieController {

	@Autowired
	MovieRepo movierepo;
	

//-------------------ADD Movies IN DB----------------------------
	
	@PostConstruct
	public void init() {
		
		Movie m1 = new Movie("M001","The Mummy",3000000);
		Movie m2 = new Movie("M002","The Firm",2000000);
		Movie m3 = new Movie("M003","Mr.Bean",2500000);
		Movie m4 = new Movie("M004","Logan",2500000);
		Movie m5 = new Movie("M005","The Avenger : Age of Ultron",6000000);
		Movie m6 = new Movie("M006","The Gun",2000000);
		Movie m7 = new Movie("M007","Moana",4000000);
		Movie m8 = new Movie("M008","Finding Nemo",5500000);
		Movie m9 = new Movie("M009","The Mummy Returns",9000000);
		Movie m10 = new Movie("M0010","Star Wars",7000000);
		
		
		List<Movie> movie = new ArrayList<Movie>();
		
		movie.add(m1);
		movie.add(m2);
		movie.add(m3);
		movie.add(m4);
		movie.add(m5);
		movie.add(m6);
		movie.add(m7);
		movie.add(m8);
		movie.add(m9);
		movie.add(m10);
		
		movierepo.saveAll(movie);
		
	}
	
//------------------------GET ALL MOVIES---------------------//
	
	
				@GetMapping("/GetAllNovies")
				public String get(Model m) {
					m.addAttribute("movies", movierepo.findAll());
					return "getMovieById";
				}
	
				
//----------------------GET MOVIE BY ID----------------------//
	
	
	@RequestMapping(value="/getMovieById", method = RequestMethod.POST)
	public String searchById(@ModelAttribute("movieId") String movieId,Model m) {
		System.out.println(movieId);
		
		String movieIdN = movieId.toUpperCase();
			
		List<Movie> movies = movierepo.findByMovieId(movieIdN);
		
		System.out.println(movies);
		
		m.addAttribute("movies", movies);
		
										//		List<Movie> movies = movierepo.findByMovieIdAndMovieName("M001", "The Mummy");
										//		List<Movie> movies = movierepo.findByMovieIdOrMovieName(null,"The Mummy");
		
		System.out.println(movies.toString().matches(movieIdN));
		if( movies.size()==0 )  {
			
			return "errorPage";
			
		}
		return"getMovieById";		
	}

								
//----------------------GET MOVIE BY Name----------------------------//
	
	
	@RequestMapping(value="/getMovieByName", method = RequestMethod.POST)
	
	public String searchByName(@ModelAttribute("movieName") String movieName,Model m) {
		
		ArrayList<Movie> allMovies=(ArrayList<Movie>) movierepo.findAll();
		ArrayList<Movie> result1=new ArrayList<Movie>();
System.out.println(allMovies + "107"); 
		Iterator<Movie> itr=allMovies.iterator();
		while(itr.hasNext()) {
			Movie movie=new Movie();
			Movie a=(Movie) itr.next();
System.out.println(a + " 112");
			String name=a.getMovieName().toUpperCase();
System.out.println(name + " 114");
			String input=movieName.toUpperCase();
System.out.println(input);
			int n=name.indexOf(input);
System.out.println(n + "117");
			if(n!=-1) {
				movie.setMovieId(a.getMovieId());
				movie.setMovieName(a.getMovieName());
				movie.setMovieCollection(a.getMovieCollection());
				result1.add(movie);
			}
System.out.println(movie+ "124");
		}
		
		if(result1.isEmpty()) {
			
			return "errorPage";
		}
		
		m.addAttribute("movies",result1);
		return "getMovieByName";
	
	}
	
	
	
//----------------------GET MOVIE BY Collection---------------------//
	
	
	@RequestMapping(value="/getMovieByC", method = RequestMethod.POST)
	public String searchByCollection(@ModelAttribute("C1") int C1,@ModelAttribute("C2") int C2, Model m) {
		
		
		ArrayList<Movie> result=(ArrayList<Movie>) movierepo.findAll();
		ArrayList<Movie> result1=new ArrayList<Movie>();
		
		Iterator<Movie> itr=result.iterator();
		while(itr.hasNext()) {
			Movie movie=new Movie();
			Movie a=(Movie) itr.next();
			
			if(a.getMovieCollection()>=C1 && a.getMovieCollection()<=C2) {
				movie.setMovieId(a.getMovieId());
				movie.setMovieName(a.getMovieName());
				movie.setMovieCollection(a.getMovieCollection());
				result1.add(movie);
			}
			
		}
		
		if(result1.isEmpty()) {
			
			return "errorPage";
		}
		m.addAttribute("movies",result1);
		return "getMovieByC";
		
	}
	
	
	
//------------------ADDING Single MOVIE IN DB---------------------------//
	
	
	@RequestMapping(value="/addMovie", method = RequestMethod.POST)
	public String addMovieInH2(@ModelAttribute("movieId") String movieId, @ModelAttribute("movieName") String movieName, @ModelAttribute("movieC") int movieC ) {
		Movie m = new Movie(movieId,movieName,movieC);
		movierepo.save(m);
		return "addMovieSuccess";
		
	}
	
	
	
//-------------------ADMIN CREDENTIALS--------------------------------//
	
	@RequestMapping(value="/movieAdmin", method = RequestMethod.POST)
	public String CheckCredentails(@ModelAttribute("email") String email, @ModelAttribute("pwd") String pwd)
	{
			
		if(("s").equalsIgnoreCase(email) && ("s").equalsIgnoreCase(pwd)) {
			
			return "movieAdmin";
		}
		else {
			return "worngCredentails";
		}
	}
		
}
