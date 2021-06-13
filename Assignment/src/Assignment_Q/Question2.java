package Assignment_Q;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int side ,area;
		
		Scanner s1= new Scanner(System.in);
		
		System.out.println("Enter Side of Square : ");
		side=s1.nextInt();
		
		area=side*side;
		
		
		System.out.println("Area of square = "+area);
	}

}
