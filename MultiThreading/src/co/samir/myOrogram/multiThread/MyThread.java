package co.samir.myOrogram.multiThread;

public class MyThread extends Thread {
	
	public MyThread() {
		super();
		
	}

	public MyThread(String name) {
		super(name);
		
	}

	@Override
	public void run() {
		for(int i=1;i<15;i++) {
			System.out.println("the thraid name is - "+Thread.currentThread().getName()+" I is "+i);
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				System.out.println("The Thraid is interrupted "+Thread.currentThread().getName());
				break;
			}
		}
		
		
	}

}
