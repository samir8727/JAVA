package co.samir.myprogram;
//import java.lang.System.*;

public class Engine {
	
	private double enginePower;
	private int noOfCylinder;
	private int ExustValve;
	private int noOfSparkPlug;
	private String fuelType;
	
	public Engine(double enginePower,int noOfCylinder,int ExustValve,int noOfSparkPlug,String fuelType) {
		this.enginePower=enginePower;
		this.noOfCylinder=noOfCylinder;
		this.ExustValve=ExustValve;
		this.noOfSparkPlug= noOfSparkPlug;
		this.fuelType=fuelType;	
	}
	public Engine() {
		
	}	
	public double getEnginePower() {
		return enginePower;
	}
	public void setEnginePower(double enginePower) {
		this.enginePower = enginePower;
	}
	public int getNoOfCylinder() {
		return noOfCylinder;
	}
	public void setNoOfCylinder(int noOfCylinder) {
		this.noOfCylinder = noOfCylinder;
	}
	public int getExustValve() {
		return ExustValve;
	}
	public void setExustValve(int exustValve) {
		ExustValve = exustValve;
	}
	public int getNoOfSparkPlug() {
		return noOfSparkPlug;
	}
	public void setNoOfSparkPlug(int noOfSparkPlug) {
		this.noOfSparkPlug = noOfSparkPlug;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	
	public void print() {
		System.out.println("Engine Details");;
		System.out.println("Engine power is - "+ enginePower + "cc");
		System.out.println("no of cylinder is - " + noOfCylinder+ " no's");
		System.out.println("no of Exust valve is - " + ExustValve+ " no's");
		System.out.println("no of spark plug is - "+ noOfSparkPlug + " no's");
		System.out.println("fuel type is - " +" \" "+ fuelType +" \"");
		
		
	}

}
