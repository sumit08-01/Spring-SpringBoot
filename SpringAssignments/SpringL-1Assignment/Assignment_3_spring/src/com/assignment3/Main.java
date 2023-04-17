package com.assignment3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		System.out.println("Assignment solotion 3");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Movie.class);
		Movie movie = (Movie) context.getBean("movie", Movie.class);
		System.out.println(movie);
		context.close();
		 		
		
	}

}
