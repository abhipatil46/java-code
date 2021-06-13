package Multilevel_Inheritance;

import Multilevel_Inheritance_Employee.Employee;
import Multilevel_Inheritance_allowance.Allowance;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1=new Employee(101,"Abhi",40000,"SDE1",004);
		Allowance a=new Allowance(e1);
		a.showEmployee();
		
	}

}
