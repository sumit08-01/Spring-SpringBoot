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
import org.springframework.web.bind.annotation.RequestBody;
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
	public Map<String,Movie> getMovies()
	{
		return movies;
	}
	
	@GetMapping("/{movieId}")
	public Object getMovie(@PathVariable("movieId") String movieId)
	{
		if(movies.containsKey(movieId))
		{
			return movies.get(movieId);
		}
		else
			{
				//return new NotFoundException("Movie with the given id not found");
				//return new NotFoundException("Movie with the given id not found").getMessage();
				return new ResponseEntity<Object>(new NotFoundException("Movie with the given id not found").getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
			}
		
	}
	
	
	
	
	
	
	@PostMapping(path="/",consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> addMovie(@RequestBody Movie movie)
	{
		//return movies.put(movieId, new Movie(movieId,movieName,movieCollection));
		movies.put(movie.getMovieId(), movie);
		return new ResponseEntity<Object>(HttpStatus.CREATED);//201
	}
	
	
	
	
	
	@PutMapping(path="/{movieId}",consumes=MediaType.APPLICATION_JSON_VALUE)
	//public <Optional>ResponseEntity<Object> updateMovie(@PathVariable("movieId") String mId,@RequestBody Movie movie)
	public Object updateMovie(@PathVariable("movieId") String mId,@RequestBody Movie movie)
	{
		if(movies.containsKey(mId))
		{
			 movies.put(mId, movie);
			 return new ResponseEntity<Object>(HttpStatus.NO_CONTENT); //204
		}
		else
		{
			//return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
			return new NotFoundException("Update Movie Failed - Movie with the given id not found").getMessage();
		}
	
	}
	
	@DeleteMapping("/{movieId}")
	//public ResponseEntity<Object> deleteMovie(@PathVariable("movieId")String movieId)
	public Object deleteMovie(@PathVariable("movieId")String movieId)
	{
		if(movies.containsKey(movieId))
		{
			movies.remove(movieId);
			return new ResponseEntity<Object>(HttpStatus.NO_CONTENT);//204
		}
		else
		{
			//return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
			return new NotFoundException("Delete Movie Failed - Movie with the given id not found").getMessage();
			
		}
	}
			

}
