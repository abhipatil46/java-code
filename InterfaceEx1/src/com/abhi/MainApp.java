package com.abhi;

import com.abhi.child.Laptop;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop l1=new Laptop("Asus viobook 14",45000.00f);
		
		l1.defCat("CZ899", "Electronics");
		float bill=l1.discount(5000.00f);
		
		System.out.println(bill);
		
	}

}
