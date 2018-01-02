package co.samir.serialization.program1;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import co.samir.serialization.program.Employee;


public class program1 {
	public static void main(String[] args) throws Exception{
		Employee[] products= {new Employee(001234, "samir rout", 33000),
				new Employee(0001235, "Aurovind Saml", 55000),
				new Employee(0001236,"Chandan Prusty",76000)};
		
		FileOutputStream file=new FileOutputStream("Employee.data");
		ObjectOutputStream obj=new ObjectOutputStream(file);
		
		for(int i=0;i<products.length;i++) {
			obj.writeObject(products[i]);
		}
		obj.close();
		file.close();
		System.out.println("completed Successfully");
				
		
		
	}

}
