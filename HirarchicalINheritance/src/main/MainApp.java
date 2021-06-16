package main;

import main.child.Telivision;
import main.child.Indore;
import main.child.Outdore;
import main.child.Laptop;

public class MainApp {

	public static void main(String[] args) {
		
		//Electronic Product
		Telivision t1=new Telivision("LG 48 Inches" ,20000.00f);
		t1.show();
		
		Laptop l1= new Laptop("Asus vivobook 14",45000.00f);
		l1.show();
		
		//Sports Products
		Indore i=new Indore("Chess",500);
		i.show();
		
		Outdore o1=new Outdore("Football",1000);
		o1.show();

	}

}
