package com.example.java8.functionalinterfaces.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;

//Example to display movie information using Consumer
class Movie {
	
	String name;
	String hero;
	String heroine;
	
	public Movie(String name, String hero, String heroine) {
		this.name = name;
		this.hero = hero;
		this.heroine = heroine;
	}
}
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Movie> movies = new ArrayList<Movie>();
		
		movies.add(new Movie("Thuppaki", "Vijay", "Kaajal"));
		movies.add(new Movie("Kaththi", "Vijay", "Sammu"));
		movies.add(new Movie("Theri", "Vijay", "Sammu"));
		
		Consumer<Movie> dispMovieInfo = M -> System.out.println("Name: " + M.name + ", Hero: " + M.hero + ", Heroine: " + M.heroine);
		
		for(Movie movie: movies) {
			dispMovieInfo.accept(movie);
		}
	}

}
