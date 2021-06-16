package main.child;

import main.cat.Sports;

public class Indore extends Sports{
	private String gameName;
	private int price;
	
	public Indore(String gameName,int price) {
		super("Indore");
		this.gameName=gameName;
		this.price=price;
		// TODO Auto-generated constructor stub
	}
	public void show() {
		System.out.println("\t"+super.prodCatagory+"\t"+super.gameType+"\t"+this.gameName+"\t"+"Rs."+this.price);
	}

}
