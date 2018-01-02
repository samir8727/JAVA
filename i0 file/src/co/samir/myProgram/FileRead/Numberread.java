package co.samir.myProgram.FileRead;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.naming.RefAddr;

public class Numberread {
	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("/home/samir/eclipse-workspaceNew/i0 file/src/co/samir/myProgram/number.dat");
		BufferedInputStream bf=new BufferedInputStream(file);
		DataInputStream data=new DataInputStream(bf);
		
		
		while(true) {
		try {
			double d=data.readDouble();
			System.out.println(d);
		} catch (IOException e) {
			break;
		}
			
		}
		
		data.close();
		bf.close();
		file.close();
		System.out.println("read successfully");
	}

}
