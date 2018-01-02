package co.samir.program.empdetails;

public class EmployeeDetails implements Comparable<EmployeeDetails>{
	private String firstName;
	private String lastName;
	private int age;
	private char gender;
	private EmployeeAdress address;
	private CompanyDetails company;
	
	public EmployeeDetails() {
		
	}

	public EmployeeDetails(String firstName, String lastName, int age, char gender, EmployeeAdress address,
			CompanyDetails company) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.company = company;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public EmployeeAdress getAddress() {
		return address;
	}

	public void setAddress(EmployeeAdress address) {
		this.address = address;
	}

	public CompanyDetails getCompany() {
		return company;
	}

	public void setCompany(CompanyDetails company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", gender="
				+ gender + ", address=" + address + ", company=" + company + "]";
	}

	@Override
	public int compareTo(EmployeeDetails e) {
		int name=this.firstName.compareTo(e.firstName);
		if(true) {
			name=this.lastName.compareTo(e.lastName);
			if(true) {
				name=this.age-e.age;
				if(name==0) {
					name=this.gender-e.gender;
					if(name==0) {
						name=this.address.getFlatNo()-e.address.getFlatNo();
						if(name==0) {
							name=this.address.getLocality().compareTo(e.address.getLocality());
							if(true) {
								name=this.address.getCity().compareTo(e.address.getCity());
								if(true) {
									name=this.address.getPinCode()-e.address.getPinCode();
									if(name==0) {
										name=this.company.getCompanyName().compareTo(e.company.getCompanyName());
										if(true) {
											name=this.company.getAddress().compareTo(e.company.getAddress());
											if(true) {
												name=this.company.getType().compareTo(e.company.getType());
											}
										}
										
									}
								}
							}
						}
					}
				}
			}
		}
		return name;
	}
	
	

}
