package co.samir.myProgram.demo;

import java.util.List;

public class LinkedList  {
	public static void main(String[] args) {
		List list=new java.util.LinkedList<String>();
		list.add("Samir");
		list.add("Ranjan");
		list.add("Rout");
		list.add("Bangalore");
		list.add(2, "ranjan");
		list.remove(2);
		
		System.out.println(list);
	}

}
