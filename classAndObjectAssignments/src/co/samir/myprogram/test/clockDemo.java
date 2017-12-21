package co.samir.myprogram.test;

import co.samir.myprogram.Clock;

public class clockDemo {
	public static void main(String[] args) {
	
		Clock clock1=new Clock(7089);
		for(int i=1;i<=68;i++) {
			clock1.tick();
			System.out.println(clock1);
		}
		System.out.println("................ ");
		String time =clock1.toString();
		System.out.println(time);
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		
		Clock clock2=new Clock(4, 58, 59);
		for(int i=1;i<=67;i++) {
			clock2.tickDown();
			System.out.println(clock2);
		}
		
		System.out.println();
		
		clock2.addClock(clock2, clock1);
		
		System.out.println();
		
		System.out.println("................ ");
		String time2 =clock2.toString();
		System.out.println(time2);
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		System.out.println();
		Clock clock3=new Clock();
		clock3.substractClock(clock1, clock2);
	}
}
