package co.samir.serialization.program;

import java.io.Serializable;

public class Employee implements Serializable {
	private static final long SerialVersionUID=1l;
	private int id;
	private String name;
	private double salary;
	
	public Employee(){
		
	}

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "product [id=" + id + ", name=" + name + ", salary=" + salary + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getSalary()=" + getSalary() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	
	

}
