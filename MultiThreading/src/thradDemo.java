import co.samir.myOrogram.multiThread.MyThread;

public class thradDemo {
	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().isAlive());
		System.out.println(Thread.currentThread().isDaemon());
		
	
		
		Thread t1=new MyThread("good");
//		Thread t2=new MyThread("bad");
//		Thread t3=new MyThread("ugly");
		
		t1.setDaemon(true);
//		t2.setDaemon(true);
//		t3.setDaemon(true);
	
		t1.start();
//		t2.start();
//		t3.start();
		
		t1.join();
		
		
		
		t1.setPriority(9);
//		t2.setPriority(8);
//		t3.setPriority(7);
		
		for(int i=1;i<20;i++) {
			System.out.println("in side the main function");
			Thread.sleep(500);
		}
		
		System.out.println("good - "+ t1.getPriority());
		
		System.out.println(Thread.activeCount());
		
		System.out.println("End of Demo");
	}

}
