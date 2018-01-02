import co.samir.myOrogram.multiThread.MyThradTask;


public class ThreadDemo2 {
	public static void main(String[] args) throws Exception {
		
		Thread t1= new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=1;i<15;i++) {
					System.out.println("the thraid name is - "+Thread.currentThread().getName()+" I is "+i);
					
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					} finally {
						System.out.println("i excute always");
					}
				}
				
			}
		});
		Thread t2= new Thread(new Runnable() {
					
			@Override
			public void run() {
				for(int i=1;i<15;i++) {
					System.out.println("the thraid name is - "+Thread.currentThread().getName()+" I is "+i);
					
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
		});
		
		Thread t3= new Thread(new Runnable() {
					
					@Override
					public void run() {
						for(int i=1;i<15;i++) {
							System.out.println("the thraid name is - "+Thread.currentThread().getName()+" I is "+i);
							
							try {
								Thread.sleep(200);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
						
					}
				});
		t1.setName("good");
		t2.setName("bad");
		t3.setName("ugly");
		
		t1.setPriority(7);
		t2.setPriority(8);
		
		
		t1.start();
		t2.start();
		t3.start();
		
				
		
	}

}
