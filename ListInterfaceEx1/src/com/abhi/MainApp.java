package com.abhi;
import java.util.List;
import java.util.ArrayList;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l = new ArrayList();
		
		//Add();
		l.add(12);
		l.add(23);
		l.add(34);
		l.add(72);
		l.add(52);
		l.add(92);

		System.out.println("Arraylist Numbers = "+l);
		System.out.println("Size ="+l.size());
		
		l.set(2, 678);
		System.out.println("Arraylist Numbers = "+l);
		
		//remove()
		l.remove(4);
		System.out.println("Arraylist Numbers = "+l);
		
		//contains();
		System.out.println(l.contains(92));
		
		
		
		}

}
