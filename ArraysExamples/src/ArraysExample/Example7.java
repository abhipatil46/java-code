
//     Give an number n find the number of occurrences of n in the array.....

package ArraysExample;

import java.util.Scanner;

public class Example7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i,n,a,sum=0;
		
		a=sc.nextInt();
		
		int arr[] = new int[a];
		
		
		System.out.println("Enter choice no : ");
		n=sc.nextInt();
		
		for(i=0;i<a;i++) {
			arr[i]=sc.nextInt();
		}
		for(i=0;i<a;i++) {
			if(arr[i]==n) {
				System.out.println(arr[i]);
			}
			
		}
		
	}

}
