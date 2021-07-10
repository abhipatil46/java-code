package com.abhi;

import com.abhi.example.Animal;
import com.abhi.example.Dog;
import com.abhi.example.Fish;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal a;
		a=new Fish();
		a.move();
		
		a=new Dog();
		a.move();
	}

}
