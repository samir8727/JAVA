package co.samir.myProgram.demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class bufferedWriter {
	public static void main(String[] args) throws IOException {
		FileWriter writer=new FileWriter("/home/samir/eclipse-workspaceNew/i0 file/src/demo3.txt");
		BufferedWriter bf=new BufferedWriter(writer);
		PrintWriter out=new PrintWriter(bf);
		out.println("hello, World ");
		out.println("I am Samir Rout");
		out.print("xyz");
		
		out.close();
		bf.close();
		writer.close();
		
		System.out.println("file writing successfully done");
		
	}

}
