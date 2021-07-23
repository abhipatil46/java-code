package com.abhi;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public class MainApp {

	public static void main(String[] args) {
		
		List course=new LinkedList();
		
		course.add("Java");
		course.add("C");
		course.add("Python");
		course.add("Ruby");
		course.add("Go");
		
		course.add(0,"CPP");
		course.set(1,"MySQl");
		System.out.println(course);
		
		course.remove(1);
		
		Collections.sort(course);
		System.out.println(course);
		
	}

}
