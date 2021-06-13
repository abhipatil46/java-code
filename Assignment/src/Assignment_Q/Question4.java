package Assignment_Q;

import java.util.Scanner;

public class Question4 {
	
	public static void main(String[] args) {
		
		int pop;
		double Tlit,litM,litW,IlitM,IlitW,men,women;
		
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter population in Town : ");
		pop=s1.nextInt();
		
		men=pop*0.52;
		women=pop-men;
		Tlit=pop*0.48;
		litM=men*0.35;
		litW=Tlit-litM;
		IlitM=men-litM;
		IlitW=women-litW;
		
		System.out.println("Total Literacy in town is : "+Tlit);
		System.out.println("Total Literate mens  in town is : "+litM);
		System.out.println("Total Literate womens in town is : "+litW);
		System.out.println("Total Illiterate mens in town is : "+IlitM);
		System.out.println("Total Illiterate womens in town is : "+IlitW);
		
		
	}
	
}
