package co.samir.myProgram.compareableObject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ComparableObject {
	
	public static void main(String[] args) {
		 List<Employee> list=new ArrayList<Employee>();
		 
		 list.add(new Employee(1045, "Ram", 12000, "abc@gmail.com"));
		 list.add(new Employee(1007, "Lakhan", 17000, "adbc@gmail.com"));
		 list.add(new Employee(1071, "raghu", 22000, "abfs@gmail.com"));
		 list.add(new Employee(1045, "Ram", 12000, "abc@gmail.com"));
		 
		if(list.get(0).compareTo(list.get(1))<0) {
			System.out.printf("%s is grater than to %s",list.get(0).getName(),list.get(1).getName());
		}
		else if(list.get(0).compareTo(list.get(1))>0) {
			System.out.printf("%s is smaller than to %s",list.get(0).getName(),list.get(1).getName());
		}
		else {
			System.out.printf("%s is equal to %s",list.get(0).getName(),list.get(1).getName());
		}
		
		System.out.println();
		
		Collections.sort(list);
		
		for(Employee emp:list) {
			System.out.println(emp);
			System.out.println();
		}
		
		System.out.println("------------------->>>>>>>>>>>>");
		System.out.println(list.size());
		System.out.println("------------------->>>>>>>>>>>>");
		Set <Employee> set=new HashSet<Employee>(list);
		System.out.println(set.size());
		for(Employee emp:set) {
			System.out.println(emp);
			System.out.println();
		}
		
	}
	

}
