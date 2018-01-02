package co.samir.program.demo;
import co.samir.program.entity.*;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class program2 {
	public static void main(String[] args) throws IOException {
		Map<UniqueIdOfEmployee,EmployeeDetails> map=new HashMap<UniqueIdOfEmployee,EmployeeDetails>();
		
		EmployeeAddress emp1addr=new EmployeeAddress(101, "RoppenaAgrehara", "Bangalore", 765432);
		EmployeeDetails emp1=new EmployeeDetails("Samir", "Rout", 23, 'M', "samir.samir16@gmail.com",emp1addr);
		
		EmployeeAddress employeeAddress2=new EmployeeAddress(234, "BBSR", "Bhubaneswar", 751021);
		EmployeeDetails employeeDetails=new EmployeeDetails("sam", "ranjan", 24, 'M', "samir.samir16@live.co.uk", employeeAddress2);
		
		map.put(new UniqueIdOfEmployee(1001234), emp1);
		map.put(new UniqueIdOfEmployee(1002345), employeeDetails);
		map.put(new UniqueIdOfEmployee(1001234), emp1);
		map.put(new UniqueIdOfEmployee(1002345), employeeDetails);
		
		System.out.println(map.size());
		
		try {
			for(UniqueIdOfEmployee id:map.keySet()) {
				System.out.println(id);
				System.out.println(map.get(id));
				System.out.println("---------->NEXT");
			}
		} catch (Exception e) {
			
		}
		
		FileOutputStream file=new FileOutputStream("employee1.data");
		BufferedOutputStream bf=new BufferedOutputStream(file);
		PrintStream out=new PrintStream(bf);
		
		for(UniqueIdOfEmployee id:map.keySet()) {
			out.println(map.get(id));
			
		}
		out.close();
		bf.close();
		file.close();
		
		System.out.println("file writeing sucessfully");
		

		
		
	}
	
	
	
	

}
