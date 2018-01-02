package co.samir.myProgram.Vector;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

import co.samir.myProgram.compareableObject.Employee;

public class vector {
	public static void main(String[] args) {
		Vector<Employee> ve=new Vector<Employee>(3,2);
		System.out.println(ve.size());
		System.out.println(ve.capacity());//the initial capacity ofvector is 10 if we not specify the capacity.
		
		ve.add(new Employee(20045, "Ram", 45000, "xyz.gmail.com"));
		ve.add(new Employee(20078, "shyam", 56000, "abc.gmail.com"));
		ve.add(new Employee(20045, "Ram", 45000, "xyz.gmail.com"));
		ve.add(new Employee(20078, "shyam", 56000, "abc.gmail.com"));
		ve.add(new Employee(20045, "Ram", 45000, "xyz.gmail.com"));
		ve.add(new Employee(20078, "shyam", 56000, "abc.gmail.com"));
		ve.add(new Employee(20045, "Ram", 45000, "xyz.gmail.com"));
		ve.add(new Employee(20078, "shyam", 56000, "abc.gmail.com"));
		ve.add(new Employee(20045, "Ram", 45000, "xyz.gmail.com"));
		ve.add(new Employee(20078, "shyam", 56000, "abc.gmail.com"));
		ve.add(new Employee(20045, "Ram", 45000, "xyz.gmail.com"));
		ve.add(new Employee(20078, "shyam", 56000, "abc.gmail.com"));
		ve.add(new Employee(20045, "Ram", 45000, "xyz.gmail.com"));
		ve.add(new Employee(20078, "shyam", 56000, "abc.gmail.com"));
		
		
		System.out.println(ve.size());
		System.out.println(ve.capacity());
		ve.sort(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		Iterator<Employee> it=ve.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Set<Employee>set=new HashSet<Employee>(ve);
		System.out.println(set.size());
		
		System.out.println(ve.firstElement());
		System.out.println(ve.lastElement());
	}

}
