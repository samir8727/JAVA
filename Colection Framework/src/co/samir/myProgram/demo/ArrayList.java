package co.samir.myProgram.demo;

import java.util.List;


public class ArrayList {
	public static void main(String[] args) {
		List<String> list;
		list=new java.util.ArrayList<String>();
		list.add("Samir");
		list.add("Rout");
		list.add("Bangalore");
		list.add(1,"Ranjan");
		list.remove(1);
		list.set(2, "Bhubaneswar");
		
		
		System.out.println(list);
		
	}
}
