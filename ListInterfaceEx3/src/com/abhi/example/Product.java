package com.abhi.example;

public class Product {

	private int proCode;
	private String proName;
	private float price;
	
	public Product() {
		this.proCode=-1;
		this.proName="#null";
		this.price=0.0f;
	}
	
	public Product(int proCode, String proName, float price) {
		super();
		this.proCode = proCode;
		this.proName = proName;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return String.format("%10d %20s %10.2f",this.proCode,this.proName,this.price);
	}
	
	
	
}
