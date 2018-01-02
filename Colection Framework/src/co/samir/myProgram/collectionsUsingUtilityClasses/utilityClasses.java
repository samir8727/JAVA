package co.samir.myProgram.collectionsUsingUtilityClasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import co.samir.myProgram.compareableObject.Employee;

public class utilityClasses {
	
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(10143, "Samir Rout", 34000, "samir.samir16@gmail.com"));
		list.add(new Employee(10067, "Aurovind Samal", 56000, "aurovind.samal@wipro.com"));
		list.add(new Employee(10087, "Chandan Prusty", 35000, "chandan.prusty123@gmail.com"));
		list.add(new Employee(10289, "Himanshu Sekhara", 42000, "him.himanshu999@gmail.com"));
		list.add(new Employee(10067, "Aurovind Samal", 56000, "aurovind.samal@wipro.com"));
		list.add(new Employee(10087, "Chandan Prusty", 35000, "chandan.prusty123@gmail.com"));
		
		Set<Employee> set = new HashSet<Employee>(list);
		System.out.println(list.size());
		System.out.println(set.size());
		
		Collections.sort(list,new Comparator<Employee>() {

			@Override
			public int compare(Employee n1, Employee n2) {
				
				return n1.getId()-n2.getId();
			}
		});
		int index=Collections.binarySearch(list, new Employee(100875, "", 0, ""));
		System.out.println(index);
		
		Employee max=Collections.max(list, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getEmail().compareTo(o2.getEmail());
			}
		});
		
		System.out.println("max - "+max);
		
		Employee min=Collections.min(list, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getEmail().compareTo(o2.getEmail());
			}
		});
		
		System.out.println("min - "+min);
		
		int count=Collections.frequency(list,new Employee(10067, "Aurovind Samal", 56000, "aurovind.samal.wipro.com"));
		System.out.println("count "+count);
		
		Iterator<Employee> it= list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
	}

}
