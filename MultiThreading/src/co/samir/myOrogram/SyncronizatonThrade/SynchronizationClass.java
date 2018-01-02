package co.samir.myOrogram.SyncronizatonThrade;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SynchronizationClass {
	
	List<String> words=new ArrayList<String>();
	
	public void addWords(String Sentence) {
		String [] array= Sentence.split("\\s");
		synchronized (words) {
			for (String a : array) {
				words.add(a);
			}
		}
		System.out.println(words);
	}
	
	public static void main(String[] args) throws Exception {
		
		SynchronizationClass sc=new SynchronizationClass();
		
		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				sc.addWords("Hey world my name is samir rout from bbsr.");
				
			}
		});
		
		Thread t2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				sc.addWords("hey whats your name and where are you from");;
				
			}
		});
		
		t1.start();
		t2.start();
		
	
		
	
		 
		
	}

}
