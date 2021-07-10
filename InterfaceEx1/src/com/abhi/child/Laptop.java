package com.abhi.child;

import com.abhi.example.Electronics;

public class Laptop extends Electronics{

	public Laptop(String prodName,float price) {
		super(prodName,price);
	}
	
	
	@Override
	public float purchace(int qtys) {
		// TODO Auto-generated method stub
		return super.price*qtys;
	}

	@Override
	public float discount(float ammount) {
		// TODO Auto-generated method stub
		
		return this.purchace(1)-ammount;
	}

	@Override
	public void defCat(String catCode, String catName) {
		// TODO Auto-generated method stub
		super.catCode=catCode;
		super.catName=catName;
	}

}
