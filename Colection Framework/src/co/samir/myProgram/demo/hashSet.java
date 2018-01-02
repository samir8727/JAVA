package co.samir.myProgram.demo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import co.samir.myProgram.entity.Products;

public class hashSet {
	
	public static void main(String[] args) {
		
		Set<Products> products=new LinkedHashSet<Products> ();
		
		
		
		products.add(new Products(1001,"Apple",100));
		products.add(new Products(1002,"Orange",70));

		products.add(new Products(1003,"PomeGranet",100));
		products.add(new Products(1004,"Greaps",120));

		products.add(new Products(1001,"Apple",100));
		products.add(new Products(1002,"Orange",70));
		
		
		
	
		
		
		
		System.out.println("Size of the set = "+products.size());
		
		for(Products i:products) {
			System.out.println(i);
		}
		

	}

}
