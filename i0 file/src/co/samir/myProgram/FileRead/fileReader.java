package co.samir.myProgram.FileRead;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class fileReader {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the full path of file - ");
		String path=sc.nextLine();
		
		
			FileReader reader=new FileReader(path);
		
			BufferedReader in=new BufferedReader(reader);
			String line;
			try {
				while((line=in.readLine())!=null) {
					System.out.println(line);
				}
				in.close();
				reader.close();
				sc.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
			
	}

}
///home/samir/eclipse-workspaceNew/i0 file/src/co/samir/myProgram/FileRead/fileReader.java
