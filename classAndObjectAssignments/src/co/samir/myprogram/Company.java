package co.samir.myprogram;

public class Company {
	private int registrationNumber;
	private String name;
	private String type;
	private String address;
	
	public Company() {
		
	}
	
	public Company(int registrationNumber ,String name,String type,String address) {
		this.registrationNumber=registrationNumber;
		this.name=name;
		this.type=type;
		this.address=address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void printCompany() {
		System.out.println("company registration number is - "+ registrationNumber);
		System.out.println("company name is - "+name);
		System.out.println("company type is - "+type);
		System.out.println("company address is - "+address);
		
	}
	
	

}
