package co.samir.myProgram.Stack;

import java.util.Stack;


public class stackClass {
	public static void main(String[] args) {
		Stack<Employee> st=new Stack<Employee>();
		
		System.out.println(st.size());
		System.out.println(st.capacity());
		
		st.push(new Employee(100011, "Samir", 23000));
		st.push(new Employee(1003, "Akshaya", 25000));
		
		System.out.println(st.size());
		System.out.println(st.capacity());
		
		st.pop(new Employee(1003, "Akshaya", 25000));
	}

}
