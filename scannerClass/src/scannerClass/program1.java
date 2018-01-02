package scannerClass;

public class program1 {
	public static void main(String[] args) {
		String name,city;
		int age;
		
		name=KeyboardScanner.getString("Enter your name : ");
		city=KeyboardScanner.getString("Enter your city name : ");
		age=KeyboardScanner.getInt("Enter your age : ");
		
		System.out.println("your name : "+name);
		System.out.println("Your city : "+city);
		System.out.println("your age : "+age);
	}

}
