package co.samir.myProgram.demo;

import java.io.FileWriter;
import java.io.IOException;

public class fileWriter {
	public static void main(String[] args) throws Exception {
		FileWriter writer=new FileWriter("/home/samir/eclipse-workspaceNew/i0 file/src/demo1.txt");
		
		writer.write("my name is samir ranjanrout\n");
		writer.write("i am from bangalore\n");
		writer.write("doing java since -");
		writer.write("August");
		
		writer.close();
		System.out.println("file writing is completed");
	}

}
