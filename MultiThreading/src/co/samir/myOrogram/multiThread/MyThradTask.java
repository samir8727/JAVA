
package co.samir.myOrogram.multiThread;


public class MyThradTask implements Runnable{
	private String name;
	
	 public MyThradTask() {
		
	}
	 
	 
	

	public MyThradTask(String name) {
		super();
		this.name = name;
	}
	




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	@Override
	public void run() {
		for(int i=1;i<15;i++){
			System.out.println("thread name is - "+Thread.currentThread().getName()+ " i is "+i);
		}
		
	}

}
