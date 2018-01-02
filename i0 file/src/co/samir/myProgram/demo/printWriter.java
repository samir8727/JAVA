package co.samir.myProgram.demo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class printWriter {
	public static void main(String[] args) throws Exception {
		FileWriter writer=new FileWriter("/home/samir/eclipse-workspaceNew/i0 file/src/demo2.txt");
		PrintWriter out=new PrintWriter(writer);
		out.println("my name is samir rout");
		out.println("I am from Bhubneswar");
		out.println("I am in my 20s");

		out.close();
		writer.close();
		System.out.println("file writing completed");
	}

}
