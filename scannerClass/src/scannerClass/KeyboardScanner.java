package scannerClass;

import java.util.Scanner;

public class KeyboardScanner {
	
	private KeyboardScanner() {
		
	}
	public static String getString(String msg) {
		Scanner sc=new Scanner(System.in);
		System.out.print(	msg);
		String ret=sc.nextLine();
		
		return ret;
	}
	
	public static int getInt(String msg) {
		Scanner sc=new Scanner(System.in);
		System.out.print(	msg);
		int Int=sc.nextInt();
		
		return Int;
	}
	
	public static double getDouble(String msg) {
		Scanner sc=new Scanner(System.in);
		System.out.print(	msg);
		double ret=sc.nextDouble();
		
		return ret;
	}
	public static float getFloat(String msg) {
		Scanner sc=new Scanner(System.in);
		System.out.print(	msg);
		float ret=sc.nextFloat();
		
		return ret;
	}
	public static long getLong(String msg) {
		Scanner sc=new Scanner(System.in);
		System.out.print(	msg);
		long ret=sc.nextLong();
		
		return ret;
	}

}
