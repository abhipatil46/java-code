package com.abhi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.abhi.ex.Movie;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList num=new ArrayList();
		num.add(34);
		num.add(78);
		num.add(90);
		num.add(44);
		num.add(84);
		
		//Collection is Interface,Collections is Class;
		Collections.sort(num);
		
		System.out.println("Numbers after sorting");
		System.out.println(num);
		
		List cities=Arrays.asList("Sangli","Pune","Mumbai","Chennai");
		Collections.sort(cities);
		System.out.println(cities);
		
		ArrayList <Movie>movieList=new ArrayList();
		
		movieList.add(new Movie("I",4));
		movieList.add(new Movie("Life of Pie",4));
		movieList.add(new Movie("Race 3",2));
		movieList.add(new Movie("Sultan",3));
		movieList.add(new Movie("Avengers",5));
		movieList.add(new Movie("Avengers End game",5));
		
		System.out.println("Arraylist Movies");
		for(Movie m:movieList) {
			System.out.println(m);
		}
		System.out.println("----------");
		System.out.println("----------");
		System.out.println("----------");
		
		//Sorting MovieList order by rating
		Collections.sort(movieList);
		for(Movie j:movieList) {
			System.out.println(j);
		}
	}

}
