package Assignment_Q;
import java.util.Scanner;


class Data{
	public int id[]=new int[5];
	public double bsal[]=new double[5];
	public double GrossSalary[]=new double[5];
	double DA,HRA,CCA;
	Scanner sc=new Scanner(System.in);
	
	public void AddEmp() {
		System.out.println("Enter Employee ID : ");
		for(int i=0;i<id.length;i++) {
			id[i]=sc.nextInt();
		}
		System.out.println("Enter Basic salary of Employee's : ");
		
		for(int i=0;i<bsal.length;i++) {
			bsal[i]=sc.nextDouble();
		}
	}
	
	public void GrossSalary() {
		
		for(int i=0;i<5;i++) {
			DA=0;
			HRA=0;
			CCA=0;
			
			if(bsal[i]>=15000) 
				DA=bsal[i]*0.15;
			else if(bsal[i]>=1000)
				HRA=bsal[i]*0.10;
			else if(bsal[i]<5000)
				CCA=bsal[i]*0.12;
			
			GrossSalary[i]=bsal[i]-DA-HRA-CCA;	
		}
		
	}
	public void Display() {
		for(int i=0;i<5;i++) {
			System.out.println(id[i]+"\t"+bsal[i]+"\t"+GrossSalary[i]);
		}
	}

	
}


public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d1=new Data();
		
		d1.AddEmp();
		d1.GrossSalary();
		d1.Display();

	}

}
