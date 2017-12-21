package co.samir.myprogram;

public class Complex {
	
	private double realPart;
	private double maginaryPart;
	
	public Complex() {
		realPart=0;
		maginaryPart=0;
	}
	
	public Complex(double realPart,double maginaryPart) {
		this.realPart=realPart;
		this.maginaryPart=maginaryPart;
	}

	public double getRealPart() {
		return realPart;
	}

	public void setRealPart(double realPart) {
		this.realPart = realPart;
	}

	public double getMaginaryPart() {
		return maginaryPart;
	}

	public void setMaginaryPart(double maginaryPart) {
		this.maginaryPart = maginaryPart;
	}
	
	public void complexAdd(Complex complex1,Complex complex2) {
		
		
		double comp1=complex1.realPart+complex2.realPart;//formula of complex number is (realpart+imaginarryPart*i)
		double comp2=complex1.maginaryPart+complex2.maginaryPart;
		
		System.out.println("addition of two complexNumber is - "+comp1+" + i"+comp2);
				
	}
	
public void complexSubstract(Complex complex1,Complex complex2) {
		
		
		double comp1=complex1.realPart-complex2.realPart;//formula of complex number is (realpart+imaginarryPart*i)
		double comp2=complex1.maginaryPart-complex2.maginaryPart;
		
		System.out.println("substraction of two complexNumber is - "+comp1+" + i"+comp2);
	}

public void complexMultiply(Complex complex1,Complex complex2) {
	double c1=(complex1.realPart*complex2.realPart);
	double c2=(complex1.realPart*complex2.maginaryPart);
	double c3=(complex1.maginaryPart*complex2.realPart);
	double c4=(complex1.maginaryPart*complex2.maginaryPart);
	double c5=c1-c4;
	double c6=c2+c3;
	System.out.println(c5+" + i"+c6);
	}

public void complexDivide(Complex complex1,Complex complex2) {
	double denominator=Math.pow((complex2.realPart),2)+Math.pow((complex2.maginaryPart),2);
	double c1=(complex1.realPart*complex2.realPart);
	double c2=(complex1.realPart*complex2.maginaryPart);
	double c3=(complex1.maginaryPart*complex2.realPart);
	double c4=(complex1.maginaryPart*complex2.maginaryPart);
	double c5=(c1+c4);
	double c6=(c3-c2);
	double c7=c5/denominator;
	double c8=c6/denominator;
	
	System.out.println("Division value of 2 complex number is - "+c7+" + i"+c8);
	
	}

public String toString() {
	return String.format("%s + i%s",realPart,maginaryPart);
}


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
