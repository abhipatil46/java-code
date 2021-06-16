package main.child;

import main.cat.Electronics;

public class Laptop extends Electronics{
	
	private String lapName;
	private float price;
	
	public Laptop(String lapName, float price) {
		super("Laptop");
		this.lapName=lapName;
		this.price=price;
	}
	public void show() {
		System.out.println("\t"+super.prodCatagory+"\t"+super.deviceType+"\t"+this.lapName+"\t"+this.price);
	}

}
