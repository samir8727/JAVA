package co.samir.program.entity;

public class EmployeeAddress {
	private int flatNo;
	private String locality;
	private String city;
	private int pin;
	
	public EmployeeAddress() {
		
	}

	public EmployeeAddress(int flatNo, String locality, String city, int pin) {
		super();
		this.flatNo = flatNo;
		this.locality = locality;
		this.city = city;
		this.pin = pin;
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

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "EmployeeAddress [flatNo=" + flatNo + ", locality=" + locality + ", city=" + city + ", pin=" + pin + "]";
	}
	

}
