
    // Write a progam to sort an array..


package ArraysExample;

import java.util.Arrays;
import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int i,n;
		int temp;
		System.out.println("Enter Size of array : ");
		
		n = sc.nextInt();
		
		int a[] = new int[n];
		
		System.out.println("Enter Array elements : ");
		
		for(i=0;i<n;i++) {
			a[i]= sc.nextInt();
		}
		for(i=0;i<n;i++) {
			if(a[i]>a[i+1]) {
				temp = a[i];
				a[i]=a[i+1];
				a[i+1]= temp;
				if(a[i]==a[i+1]) break;
			}
			System.out.println(a[i]);
			}
			
			
		}
		
		
	}


