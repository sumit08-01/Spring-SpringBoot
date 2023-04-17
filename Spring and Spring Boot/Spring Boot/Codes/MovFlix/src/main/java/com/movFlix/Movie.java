package com.movFlix;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@SuppressWarnings("serial")
@Entity
public class Movie implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer SNo;
	

	private String movieId;
	private String movieName;
	private int movieCollection;
	
	public Movie()
	{
		
	}

	public Movie(String movieId, String movieName, int movieCollection)
	{
		this.movieId=movieId;
		this.movieName=movieName;
		this.movieCollection=movieCollection;
	}

	
	public Integer getSNo() {
		return SNo;
	}

	public void setSNo(Integer sNo) {
		SNo = sNo;
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
	
	
	
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", movieCollection=" + movieCollection + "]";
	}
}
