package Questions;

import java.util.Scanner;


public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n1,n2,choice,rem;
		int rev=0,pos=0;
		
		System.out.println("Enter two no's : ");
		n1=s.nextInt();
		n2=s.nextInt();
		
		System.out.println("Make a choice to print No's from "+n1+" to"+n2);
		System.out.println("--------------------------------------------------");
		System.out.println("1: Even Numbers");
		System.out.println("2: Prime Numbers");
		System.out.println("3: Pelendrome Numbers");
		choice=s.nextInt();
		
		
		switch(choice)
		{
		case 1:
			for(int i=n1;i<=n2;i++)
			{
				if(i%2==0)
					System.out.println(i);
			}
			break;
			
		case 2:
			for(int i=n1;i<=n2;i++) 
			{
				pos=0;
				for(int j=1;j<=i;j++) 
				{
					if(i%j==0)
						pos++;
				}
				if(pos>2)
					System.out.println("Numbre "+i+" is not a prime no");
				else
					System.out.println("Numbre "+i+" is a prime no");	
			}
			break;
		case 3:
			for(int i=n1;i<=n2;i++) {
				for(int j=i;j>0;j++) {
					rem=j%10;
					rev=rev*10+rem;
					j=j/10;
				}
				if(rev==i) {
					System.out.println(i+" is a palendrom Number");
				}else {
					System.out.println(i+" is Not a palendrom Number");
				}
			}
			break;
		default:
			System.out.println("Enter valod choice");
			
		}
	}
}
