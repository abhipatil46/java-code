package com.abhi.ex;

public class Employee {
	private int empCode;
	private String empName;
	private float sal;
	public Employee() {
		this.empCode=0;
		this.empName="-";
		this.sal=0.0f;
	}
	
	public Employee(int empCode, String empName, float sal) {
		super();
		this.empCode = empCode;
		this.empName = empName;
		this.sal = sal;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%10d %20s %10.2f", this.empCode,this.empName,this.sal);
	}

	public int getEmpCode() {
		return empCode;
	}

	public void setEmpCode(int empCode) {
		this.empCode = empCode;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getSal() {
		return sal;
	}

	public void setSal(float sal) {
		this.sal = sal;
	}
	
	
	
	
}
