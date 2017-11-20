package samir;

//Construction Overloading;

public class Employee1 {
	int id;
	String name;
	double salary;
	
	public Employee1(int id,String name,double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		
	}
	public Employee1(int id,String name) {
		this.id=id;
		this.name=name;
	}
	public Employee1(String name,double salary) {
		this.name=name;
		this.salary=salary;
	}

}
