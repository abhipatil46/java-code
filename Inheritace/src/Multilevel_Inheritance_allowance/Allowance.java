package Multilevel_Inheritance_allowance;

import Multilevel_Inheritance_Employee.Employee;

public class Allowance extends Employee{
	
	private Employee e1;
	public Allowance() {
		super.da=9.5;
		super.hra=4.5;
	}
	public Allowance(Employee e1) {
		this();
		this.e1=e1;
	}
	public void showEmployee() {
		super.da=e1.getSalary()*super.da/100;
		super.hra=e1.getSalary()*super.hra/100;
		super.gross=da+hra+e1.getSalary();
		
		System.out.println("Employee Code :"+e1.getEmpCode());
		System.out.println("Employee Name : "+e1.getEmpName());
		System.out.println("Employee Salary :"+e1.getSalary());
		System.out.println("dearness Allowance : "+da);
		System.out.println("Houserent Allowance : "+hra);
		System.out.println("Gross Salary : "+gross);
		
	}
}
