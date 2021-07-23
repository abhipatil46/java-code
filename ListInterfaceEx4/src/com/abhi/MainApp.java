package com.abhi;
import java.util.ArrayList;
import com.abhi.ex.Employee;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1 =new Employee(101,"Abhi",40000.0f);
		Employee e2 =new Employee(102,"Jack",30000.0f);
		Employee e3 =new Employee(213,"Harry",30000.0f);
		Employee e4 =new Employee(104,"Dev",35000.0f);
		Employee e5 =new Employee(105,"Sam",20000.0f);
		
		ArrayList <Employee>eList=new ArrayList();
		
		eList.add(e1);
		eList.add(e2);
		eList.add(e3);
		eList.add(e1);
		eList.add(e4);
		eList.add(e5);
		
		for(Employee s:eList) {
			System.out.println(s);
		}
		
		int pos=-1;
		for(int i=0;i<eList.size();i++) {
			if(eList.get(i).getEmpName().equals("Abhi"))
				pos=i;
			}
		if(pos!=-1)
			System.out.println("Employee Exists");
		else
			System.out.println("Employee Not Exists");
		
	}

}
