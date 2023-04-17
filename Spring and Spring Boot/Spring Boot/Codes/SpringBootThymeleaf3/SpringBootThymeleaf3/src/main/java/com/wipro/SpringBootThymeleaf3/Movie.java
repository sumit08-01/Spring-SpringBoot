package com.wipro.SpringBootThymeleaf3;

public class Movie {
	private String movieName;
	private String movieActor;
	
	public Movie()
	{
		
	}
	public Movie(String movieName, String movieActor) {
		super();
		this.movieName = movieName;
		this.movieActor = movieActor;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieActor() {
		return movieActor;
	}
	public void setMovieActor(String movieActor) {
		this.movieActor = movieActor;
	}
	
}
