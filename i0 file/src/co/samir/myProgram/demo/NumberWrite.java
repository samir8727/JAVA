package co.samir.myProgram.demo;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class NumberWrite {
	public static void main(String[] args) throws IOException {
		FileOutputStream file=new FileOutputStream("/home/samir/eclipse-workspaceNew/i0 file/src/co/samir/myProgram/number.dat");
		BufferedOutputStream bf=new BufferedOutputStream(file);
		DataOutputStream data=new DataOutputStream(bf);
		
		data.writeDouble(56.87);
		data.writeDouble(3.4e-7);
		data.writeDouble(67.98);
		data.writeDouble(55.98);
		data.writeDouble(99.8);
		data.writeDouble(1.02);
		
		data.close();
		bf.close();
		file.close();
		
		System.out.println("file write successfully done...");
	}

}
