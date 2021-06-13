package Multilevel_Inheritance_Employee;

import multilevel_inheritance_department.Department;

public class Employee extends Department{
	private int empCode;
	private String empName;
	private double salary;
	
	protected double da,hra,gross;
	
	Department d1=new Department();
	public Employee() {
		this.empCode=-1;
		this.empName="-";
		this.salary=-1;
	}

	public Employee(int empCode, String empName, double salary,String Name,int Code) {
		super();
		this.empCode = empCode;
		this.empName = empName;
		this.salary = salary;
		
	}

	public int getEmpCode() {
		return empCode;
	}

	public String getEmpName() {
		return empName;
	}

	public double getSalary() {
		return salary;
	}
	
	
}
