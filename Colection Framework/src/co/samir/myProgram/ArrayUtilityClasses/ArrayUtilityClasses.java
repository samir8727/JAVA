package co.samir.myProgram.ArrayUtilityClasses;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import co.samir.myProgram.compareableObject.Employee;
import co.samir.myProgram.iterator.iterator;

public class ArrayUtilityClasses {
	public static void main(String[] args) throws IOException {
		
	
	
		Employee[] emp= {new Employee(10143, "Samir Rout", 34000, "samir.samir16@gmail.com"),
				new Employee(10167, "Aurovind Samal", 56000, "aurovind.samal@wipro.com"),
				new Employee(10087, "Chandan Prusty", 35000, "chandan.prusty123@gmail.com"),
				new Employee(10289, "Himanshu Sekhara", 42000, "him.himanshu999@gmail.com"),
				new Employee(10167, "Aurovind Samal", 56000, "aurovind.samal@wipro.com"),
				new Employee(10087, "Chandan Prusty", 35000, "chandan.prusty123@gmail.com")};
		
		Employee[] emp2={new Employee(10143, "Samir Rout", 34000, "samir.samir16@gmail.com"),
				new Employee(10167, "Aurovind Samal", 56000, "aurovind.samal@wipro.com"),
				new Employee(10087, "Chandan Prusty", 35000, "chandan.prusty123@gmail.com"),
				new Employee(10289, "Himanshu Sekhara", 42000, "him.himanshu999@gmail.com"),
				new Employee(10167, "Aurovind Samal", 56000, "aurovind.samal@wipro.com"),
				new Employee(10087, "Chandan Prusty", 35000, "chandan.prusty123@gmail.com")};
		
		Arrays.sort(emp, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getId()-o2.getId();
			}
		});
		Arrays.sort(emp2);
		
		//System.out.println(Arrays.toString(emp));
		
		for(Employee e:emp) {
			System.out.println(e);
		}
		
		int index=Arrays.binarySearch(emp,new Employee(10143, "Samir Rout", 34000, "samir.samir16@gmail.com"));
		System.out.println(index);
		
		System.out.println("----------------------...................>>>>>>>>>>>>>>>>>>");
		
		List<Employee> list=Arrays.asList(emp);
		Iterator<Employee> it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Set<Employee> set=new HashSet<Employee>(list);
		System.out.println(emp.length);
		System.out.println(list.size());
		System.out.println(set.size());
		
		Iterator<Employee> em=set.iterator();
		while(em.hasNext()) {
			System.out.println(em.next());
		}
		
		boolean compare=Arrays.deepEquals(emp, emp2);
		System.out.println(compare);
		
		Employee[] emp3=Arrays.copyOf(emp, 10);
		
		
		for(Employee e:emp3) {
			System.out.println(e);
		}
		
	
			FileOutputStream file=new FileOutputStream("emp.data");
			BufferedOutputStream bf=new BufferedOutputStream(file);
			ObjectOutputStream obj=new ObjectOutputStream(bf);
			
			try {
				for(Employee empl:set) {
					obj.writeObject(empl);
				}
			} catch (Exception e1) {
				System.out.println("problem");
			}
			
			
			System.out.println("File write or serialization complete");
		
		
		
		
	
	
	
	
	}
			
			
	

}
