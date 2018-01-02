package co.samir.program.empdetails;

public class CompanyDetails {
	
	private String CompanyName;
	private String address;
	private String type;
	
	public CompanyDetails() {
		
	}

	public CompanyDetails(String companyName, String address, String type) {
		super();
		CompanyName = companyName;
		this.address = address;
		this.type = type;
	}

	public String getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "CompanyDetails [CompanyName=" + CompanyName + ", address=" + address + ", type=" + type + "]";
	}
	

}
