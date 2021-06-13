package Questions;
import java.util.Scanner;
public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s1=new Scanner(System.in);
		
		int temp,n1,max=0,rem,s=0;
		
		System.out.println("Enter any no");
		n1=s1.nextInt();
		
		temp=n1;
		for(int i=temp;i>0;i++) {
			rem=temp%10;
			s=rem;
			if(s>max)
				max=rem;
			temp=temp/10;
		}
		System.out.println("Here , I found "+max+" As max digit in "+n1);
	}

}
