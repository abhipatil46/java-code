package Assignment_Q;
import java.util.Scanner;

class Employee{
	public int salary;
	public String name;
	public double DA,HRA,CCA,GSalary;
	Scanner sc =new Scanner(System.in);
	
	public void AddEmp() {
		System.out.println("Enter Employee name");
		name=sc.next();
		System.out.println("Enter Employee Salary");
		salary=sc.nextInt();
	}
	public double GrossSalary() {
		DA=salary*0.15;
		HRA=salary*0.16;
		CCA=salary*0.21;
		
		GSalary=salary-DA-HRA-CCA;
		return GSalary;
	}
	public void display() {
		System.out.println("Name of Employee is : "+name);
		System.out.println("salary of Employee is : "+salary);
		System.out.println("Gross Salary of Employee is : "+GrossSalary());
	}
	
}


public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		
		e1.AddEmp();
		e1.display();

	}

}
