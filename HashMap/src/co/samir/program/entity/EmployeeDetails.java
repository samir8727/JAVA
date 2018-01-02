package co.samir.program.entity;

public class EmployeeDetails {
	
	private String firstName;
	private String LastName;
	private int age;
	private char gender;
	private String email;
	private EmployeeAddress address;
	
	public EmployeeDetails() {
		
	}

	public EmployeeDetails(String firstName, String lastName, int age, char gender, String email,
			EmployeeAddress address) {
		super();
		this.firstName = firstName;
		LastName = lastName;
		this.age = age;
		this.gender = gender;
		this.email = email;
		this.address = address;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public EmployeeAddress getAddress() {
		return address;
	}

	public void setAddress(EmployeeAddress address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [firstName=" + firstName + ", LastName=" + LastName + ", age=" + age + ", gender="
				+ gender + ", email=" + email + ", address=" + address + "]";
	}
	
	
		
	

}
