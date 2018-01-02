package co.samir.myProgram.comparatorObject;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import co.samir.myProgram.compareableObject.Employee;
import co.samir.myProgram.demo.ArrayList;

public class comparatordemo1 {
	
	static class EmployeeSalaryComparator implements Comparator<Employee>{

		@Override
		public int compare(Employee s1, Employee s2) {
			
			return Double.compare(s1.getSalary(),s2.getSalary());
		}
		
	}
	static class EmployeeIdComparator implements Comparator<Employee>{

		@Override
		public int compare(Employee i1, Employee i2) {
	
			return i1.getId()-i2.getId();
		}
		
	}
	
	public static void main(String[] args) {
		List<Employee> list=new java.util.ArrayList<>();
		
		 list.add(new Employee(1048, "Ram", 12000, "abc@gmail.com"));
		 list.add(new Employee(1007, "Lakhan", 17000, "adbc@gmail.com"));
		 list.add(new Employee(1071, "Raghu", 22000, "abfs@gmail.com"));
		 list.add(new Employee(1045, "Ram", 12000, "abc@gmail.com"));
		 list.add(new Employee(1048, "Ram", 12000, "abc@gmail.com"));
		 
		 Collections.sort(list,new Comparator<Employee>() { //Anonymous Object creation

			@Override
			public int compare(Employee n1, Employee n2) {
				
				return n1.getName().compareTo(n2.getName());
			}
			 
		 });
		 
		 for(Employee emp:list) {
			 System.out.println(emp);
			 System.out.println();
		 }
		
	}
	
	

}
