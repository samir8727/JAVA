package co.samir.myProgram.iterator;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import co.samir.myProgram.compareableObject.Employee;

public class iterator {
	
	public static void main(String[] args) {
		List<Employee> list=new ArrayList<Employee>();
		 list.add(new Employee(1048, "Ram", 12000, "abc@gmail.com"));
		 list.add(new Employee(1007, "Lakhan", 17000, "adbc@gmail.com"));
		 list.add(new Employee(1071, "Raghu", 22000, "abfs@gmail.com"));
		 list.add(new Employee(1045, "Rahul", 15000, "abcd@gmail.com"));
		 list.add(new Employee(1048, "Ram", 12000, "abc@gmail.com"));
		 
		Set<Employee> set=new HashSet<Employee>(list);
		
		System.out.println(list.size());
		System.out.println(set.size());
		
		Iterator<Employee> it=set.iterator();
		try {
			while(it.hasNext()) {
				
				System.out.println(it.next());
				
				it.remove();
				System.out.println("remove success fully");
				System.out.println(it.hasNext());
			}
		} catch (ConcurrentModificationException e) {
			e.printStackTrace();
		}
		 
		 
	}

}
