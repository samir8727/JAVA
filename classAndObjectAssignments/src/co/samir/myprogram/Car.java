package co.samir.myprogram;

public class Car {
	
	private double height;
	private double weight;
	private String color;
	private Engine engine;
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public Car() {
		
	}
	
	
	public void printCar() {
		System.out.println("car name ");
		System.out.println("car height is - "+height + " ft");
		System.out.println("car weight is - "+weight+" kg");
		System.out.println("car color is - "+color);
		engine.print();
	}

}
