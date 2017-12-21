package co.samir.myprogram.test;

import javax.print.PrintService;

import co.samir.myprogram.Car;
import co.samir.myprogram.Engine;

public class Test {
	public static void main(String[] args) {
		
		Engine engine1=new Engine(900.3, 4, 2, 2, "Petrol");
		
		Car tyotaFartuner=new Car();
		tyotaFartuner.setHeight(7.8);
		tyotaFartuner.setWeight(2000);
		tyotaFartuner.setColor("black");
		tyotaFartuner.setEngine(engine1);
		tyotaFartuner.printCar();
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<");
		
		Engine engine2=new Engine(800.9, 4, 3, 2, "Disel");
		Car hyundaiVerna=new Car();
		hyundaiVerna.setHeight(6.1);
		hyundaiVerna.setWeight(1300);
		hyundaiVerna.setColor("Red");
		hyundaiVerna.setEngine(engine2);
		
		hyundaiVerna.printCar();
		
		//tyotaFartuner.printCar();
	}

}
