package co.samir.program.empdetails;

public class EmployeeAdress {
	
	private int flatNo;
	private String locality;
	private String city;
	private int pinCode;
	
	public EmployeeAdress() {
		
	}

	public EmployeeAdress(int flatNo, String locality, String city, int pinCode) {
		super();
		this.flatNo = flatNo;
		this.locality = locality;
		this.city = city;
		this.pinCode = pinCode;
	}

	public int getFlatNo() {
		return flatNo;
	}

	public void setFlatNo(int flatNo) {
		this.flatNo = flatNo;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "EmployeeAdress [flatNo=" + flatNo + ", locality=" + locality + ", city=" + city + ", pinCode=" + pinCode
				+ "]";
	}
	

}
