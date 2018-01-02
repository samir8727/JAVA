package co.samir.program.demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.TreeMap;

import co.samir.program.empdetails.CompanyDetails;
import co.samir.program.empdetails.EmployeeAdress;
import co.samir.program.empdetails.EmployeeDetails;
import co.samir.program.entity.EmployeeId;

public class program1 {
	public static void main(String[] args) throws IOException {
		
		Map<EmployeeId,EmployeeDetails> map=new TreeMap<EmployeeId,EmployeeDetails>();
		
		CompanyDetails emp1C=new CompanyDetails("Accenture", "Bangalore", "Software");
		EmployeeAdress emp1A=new EmployeeAdress(101, "bangalore", "Bangalore", 657783);
		EmployeeDetails emp1=new EmployeeDetails("samir", "rout", 23, 'M', emp1A, emp1C);
		
		CompanyDetails emp2C=new CompanyDetails("wipro", "bangalore", "software");
		EmployeeAdress emp2A=new EmployeeAdress(102, "bangalore", "Bangalore", 657783);
		EmployeeDetails emp2=new EmployeeDetails("Sam", "Rao", 24, 'M', emp2A, emp2C);
		
		map.put(new EmployeeId(100067), emp1);
		map.put(new EmployeeId(100034), emp2);
		map.put(new EmployeeId(100067), emp1);
		map.put(new EmployeeId(100034), emp2);
		map.put(new EmployeeId(100067), emp1);
		map.put(new EmployeeId(100034), emp2);
		
		System.out.println(map.size());
		for(EmployeeId id:map.keySet()) {
			System.out.println(map.get(id));
			System.out.println("");
			
		
		}
		
		FileWriter file=new FileWriter("emp.deta");
		BufferedWriter bf=new BufferedWriter(file);
		PrintWriter out=new PrintWriter(bf);
		
		for(EmployeeId id:map.keySet()) {
			out.println(map.get(id));
			out.println("");
			
		
		}
		
		out.close();
		bf.close();
		file.close();
		
		System.out.println("Write successfully");
		
		
	}

}
