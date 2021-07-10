package com.abhi.example;

public abstract class Electronics extends Catagory{

	protected String prodName;
	protected float price;
	
	public Electronics() {
		prodName="";
		price=0;
	}

	public Electronics(String prodName, float price) {
		super();
		this.prodName = prodName;
		this.price = price;
	}
	
	public abstract float purchace(int qtys);
	public abstract float discount (float ammount);
	
//	@Override
//	public void defCat(String catCode, String catName) {
//		
//		
//	}

}
