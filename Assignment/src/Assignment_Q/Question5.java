package Assignment_Q;
import java.util.Scanner;
public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		
		int price,qty,bill;
		System.out.println("Enter price & qty of product : ");
		price=s1.nextInt();
		qty=s1.nextInt();
		
		bill=price*qty;
		System.out.println("Total bill is : "+bill);
	}

}
