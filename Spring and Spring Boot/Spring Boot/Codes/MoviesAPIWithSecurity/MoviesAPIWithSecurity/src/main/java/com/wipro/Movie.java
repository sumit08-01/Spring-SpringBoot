package com.wipro;

public class Movie {
	private String movieId;
	private String movieName;
	private int movieCollection;
	
	public Movie()
	{
		
	}

	public Movie(String movieId,String movieName, int movieCollection)
	{
		this.movieId=movieId;
		this.movieName=movieName;
		this.movieCollection=movieCollection;
	}

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public int getMovieCollection() {
		return movieCollection;
	}

	public void setMovieCollection(int movieCollection) {
		this.movieCollection = movieCollection;
	}
	
}
