package samir;

public class ClassTest {
	public static void main(String[] args) {
		new car(); //this statement is allocated the memory.
		car ford; // here ford is the referance for allocated memory.
		ford=new car();//
		ford.height=6.5;
		ford.weight=500.7;
		ford.colour="red";
		ford.speed=133;
		
		System.out.println(ford.height+" ft");
		System.out.println(ford.weight+" kg");
		System.out.println(ford.colour+" colour");
		System.out.println(ford.speed+" km/hr");
		
		ford.start();
	}

}
