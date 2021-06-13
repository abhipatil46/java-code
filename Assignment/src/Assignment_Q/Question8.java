package Assignment_Q;

import java.util.Scanner;
public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int arr[]=new int[5];
		System.out.println("Enter 5 no's : ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int add=0;
		int fact=1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%3==0) 
			 add=add+arr[i];
			else if(arr[i]%2==0 ) {
				fact=1;
				for(int j=arr[i];j>0;j--){
					fact=fact*(j);
				}
				System.out.println("factorial of "+arr[i]+" is "+fact);
			}		
		}
		System.out.println("Addition is "+add);
		
	}

}
