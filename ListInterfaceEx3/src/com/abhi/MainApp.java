package com.abhi;
import java.util.ArrayList;

import com.abhi.example.Product;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Product>p=new ArrayList();
		
		p.add(new Product(101,"Monitor",10000.0f));
		p.add(new Product(102,"Mouse",500.0f));
		p.add(new Product(103,"KeyBord",700.0f));
		p.add(new Product(104,"SMPS",700.0f));
		
		System.out.println("Total No of Products are = "+p.size());
		System.out.println(p);
		
		System.out.println("Using Index for Loop");
		for(int i=0;i<p.size();i++) {
			System.out.println(p.get(i));
		}
		
		System.out.println("Using Index Inhanced for Loop");
		for(Product s:p) {
			System.out.println(s);
		}

	}

}
