package co.samir.myprogram;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private char gender;
	private Company company;
	private String[] tasklist;
	
	
	public Employee(int id,String name,double salary,char gender,Company company,String[] tasklist) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.gender=gender;
		this.company=company;
		
	}
	public Employee(double salary,String name,char gender,Company company,String[] tasklist) {
		this();
		this.salary=salary;
		this.name=name;
		this.gender=gender;
		this.company=company;
	}
	
	
	public Employee() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
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
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company=company;
	}
	
	public String[] getTasklist() {
		return tasklist;
	}
	public void setTasklist(String[] tasklist) {
		this.tasklist = tasklist;
	}
	
	public void doSomething(String whatAreYouDoing) {
		System.out.println("the employee is doing "+whatAreYouDoing);
	}
	
	public void displayTask(String[] tasklist) {
		System.out.println("the task list for this employee.");
		for(int i=0;i<tasklist.length;i++) {
			System.out.println(tasklist[i]);
		}
	}
	
	public void riseSalary(Employee emp,int persent) {
		if (salary==0) {
			System.out.println("the salary is not set yet please set some some salary");
		}
		else {
			double persentage = (salary/100)*persent ;
			double hikeSalary=salary+persentage;
			System.out.println("your previous salary is "+salary+" after"+persent+" % hike the salay is "+hikeSalary);
		}
		
	}
	
	public void printEmployeeDetails() {
		System.out.println("Employee id is     - "+id);
		System.out.println("Employee name is   - "+name);
		System.out.println("Employee salary is - "+salary);
		System.out.println("Employee gender is - "+gender);
		
		company.printCompany();
		
	}

}
