package main.child;

import main.cat.Electronics;

public class Telivision extends Electronics {

	private String tvName;
	private float price;
	
	public Telivision(String tvName, float price) {
		super("Telivision");
		this.tvName=tvName;
		this.price=price;
		// TODO Auto-generated constructor stub
	}
	public void show() {
		System.out.println("\t"+super.prodCatagory+"\t"+super.deviceType+"\t"+this.tvName+"\t"+this.price);
	}

}
