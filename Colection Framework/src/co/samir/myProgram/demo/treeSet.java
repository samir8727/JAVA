package co.samir.myProgram.demo;
import co.samir.myProgram.entity.Product2;

import java.util.Set;
import java.util.TreeSet;

public class treeSet {
	public static void main(String[] args) {
		
	
	
		Set<Product2> product = new TreeSet<Product2>();
		product.add(new Product2(1,"Apple",34));
		product.add(new Product2(2,"Orange",56));
		product.add(new Product2(1,"Apple",34));
		product.add(new Product2(2,"Orange",56));
		product.add(new Product2(3,"Greaps",99));
		
		System.out.println(product.size());
		
		for(Product2 p:product) {
			System.out.println(p);
		}
	
	}

}
