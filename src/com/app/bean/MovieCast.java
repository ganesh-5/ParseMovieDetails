package com.app.bean;

import java.util.Date;



public class MovieCast {

	
	private int movie_id;
	private Category category;
	private String movie_name;
	private String actors;
	private String director;
	private Date release_year;
	
	public MovieCast() {
		//default constructor
	}
	
	public MovieCast(int movie_id, Category category, String movie_name,String actors, String director, Date release_year) {
		this.movie_id = movie_id;
		this.category = category;
		this.movie_name = movie_name;
		this.actors = actors;
	    this.director = director;
	    this.release_year = release_year;
	}
	
	
	public int getmovie_id() {
		return movie_id;
	}

	public String getmovie_name() {
		return movie_name;
	}
	
	public String getactors() {
		return actors;
	}
	
	public String getdirector() {
		return director;
	}
	
	public Date getrelease_year() {
		return release_year;
	}
	
	

	public Category getcategory() {
		return category;
	}
}

