package co.samir.program.entity;

public class EmployeeId implements Comparable<EmployeeId> {
	
	private int id;
	
	public EmployeeId() {
		
	}

	public EmployeeId(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "EmployeeId [id=" + id + "]";
	}

	@Override
	public int compareTo(EmployeeId p) {
		int res=this.id-p.id;
		if(res==0)
			
		return res;
		return res;
		
		
	}
	
	

}
