package Assignment_Q;

import java.util.Scanner;

public class Question1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int wid,hei,area,perimeter;
		
		Scanner s1= new Scanner(System.in);
		
		System.out.println("Enter height & width of rectangle : ");
		hei=s1.nextInt();
		wid=s1.nextInt();
		area=wid*hei;
		perimeter=2*wid+2*hei;
		
		System.out.println("Area of rectangle = "+area+" & perimeter of rectangle is = "+perimeter);
	}

}
