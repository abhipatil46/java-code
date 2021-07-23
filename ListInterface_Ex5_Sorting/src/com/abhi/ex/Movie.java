package com.abhi.ex;

public class Movie implements Comparable<Movie> {
	public String movieName;
	public int rating;

	public Movie() {
		this.movieName="-";
		this.rating=0;
	}

	public Movie(String movieName, int rating) {
		super();
		this.movieName = movieName;
		this.rating = rating;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%20s %10d", this.movieName,this.rating);
	}

	@Override
	public int compareTo(Movie m) {
		// TODO Auto-generated method stub
		if(this.rating>m.rating)
			return 1;
		else if(this.rating<m.rating)
			return -1;
		else
			return 0;	
	}
	
	
}
