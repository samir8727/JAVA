package samir;

public class Test2 {
	public static void main(String[] args) {
		Employee1 emp1=new Employee1(1001,"Jack Sparrow",40000.5);
		System.out.println("Employee 1 id - "+emp1.id);
		System.out.println("Employee 1 Name - "+emp1.name);
		System.out.println("Employee 1 Salary - "+emp1.salary);
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		Employee1 emp2=new Employee1(1002, "Crack Sparrow");
		System.out.println("Employee 2 id - "+emp2.id);
		System.out.println("Employee 2 name - "+emp2.name);
		
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		Employee1 emp3=new Employee1("Sameer Rout",18000.9);
		System.out.println("Employee 3 name - "+emp3.name);
		System.out.println("Employee 3 salary - "+emp3.salary);
	}

}
