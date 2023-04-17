package com.movFlix;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface MovieRepo extends CrudRepository<Movie, Integer> {
	
	public List<Movie> findByMovieId(String movieid);
	public List<Movie> findByMovieName(String movieName);
	public List<Movie> findByMovieCollection(int movieCollection);
	public List<Movie> findAll();
	

	
	
//	public List<Movie> findOnlyMovieId();
	
//	public List<Movie> findByMovieIdAndMovieName(String movieid, String movieName );
//	public List<Movie> findByMovieIdOrMovieName(String movieid , String movieName );
	

}
