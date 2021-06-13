package Assignment_Q;

import java.util.Scanner;
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inch;
		double yard,feet;
		Scanner s1= new Scanner(System.in);
		
		System.out.println("Enter length in inch to convert : ");
		inch=s1.nextInt();
		
		yard=inch*0.027;
		feet=inch*0.083;
		
		
		
		System.out.println(inch+" if feet is "+feet+" feet");
		System.out.println(inch+" if yard is "+yard+" yard");
	}

}
