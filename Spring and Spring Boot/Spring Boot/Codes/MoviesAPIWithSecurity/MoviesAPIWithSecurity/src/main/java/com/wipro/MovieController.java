package com.wipro;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
	
	private Map<String,Movie> movies=new ConcurrentHashMap<String,Movie>();
	
	public MovieController()
	{
		movies.put("M001", new Movie("M001","TopGun",10000));
		movies.put("M002", new Movie("M002","The Mummy",20000));
		
	}
		
	@GetMapping
	public Map getMovies()
	{
		return movies;
	}
	
	
	@GetMapping("/{movieId}")
	public Movie getMovie(@PathVariable("movieId") String movieId)
	{
		return movies.get(movieId);
	}
	
	@PostMapping(path="/",consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public ResponseEntity<Object> addMovie(@ModelAttribute("movieId") String movieId,@ModelAttribute("movieName") String movieName,@ModelAttribute("movieCollection") int movieCollection)
	{
		movies.put(movieId, new Movie(movieId,movieName,movieCollection));
		return new ResponseEntity<Object>(HttpStatus.CREATED);
	}
		
	
	@PutMapping("/{movieId}")
	public ResponseEntity<Object> updateMovie(@PathVariable("movieId") String mId,@ModelAttribute("movieId") String movieId,@ModelAttribute("movieName") String movieName,@ModelAttribute("movieCollection") int movieCollection)
	{
		if(movies.containsKey(mId))
		{
			 movies.put(mId, new Movie(movieId,movieName,movieCollection));
			 return new ResponseEntity<Object>(HttpStatus.NO_CONTENT);//204
		}
		else
		{
			return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR); //500
		}
	
	}
	
	
	@DeleteMapping("/{movieId}")
	public ResponseEntity<Object> deleteMovie(@PathVariable("movieId")String movieId)
	{
		if(movies.containsKey(movieId))
		{
			movies.remove(movieId);
			return new ResponseEntity<Object>(HttpStatus.NO_CONTENT);//204
		}
		else
		{
			return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);//500
			
		}
	}
			

}
