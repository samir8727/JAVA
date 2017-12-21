package co.samir.myprogram.test;
import java.util.concurrent.CompletionException;

import co.samir.myprogram.*;

public class ComplexDemo {
public static void main(String[] args) {
	Complex complex1=new Complex(4, 3);
	
	String comp=complex1.toString();
	System.out.println(comp);
	
	Complex complex2=new Complex(3, 2);
	
	Complex complex3=new Complex();
	
	complex3.complexAdd(complex1, complex2);
	
	complex3.complexSubstract(complex1, complex2);
	
	complex3.complexMultiply(complex1, complex2);
	
	complex3.complexDivide(complex1, complex2);
	
	
	
}
}
