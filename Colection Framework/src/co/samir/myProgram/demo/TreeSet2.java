package co.samir.myProgram.demo;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet2 {
	public static void main(String[] args) {
		Set<String> names=new TreeSet<String>();
		
		names.add("sameer");
		names.add("samir");
		names.add("samir");
		names.add("gunu");
		
		System.out.println(names);
	}

}
