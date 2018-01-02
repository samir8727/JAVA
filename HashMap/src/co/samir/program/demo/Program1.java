package co.samir.program.demo;

import java.util.HashMap;
import java.util.Map;

public class Program1 {

	public static void main(String[] args) {
		
		Map<Integer,String> map=new HashMap<Integer,String>();
		
		map.put(1001, "Samir Rout ,Bhubaneswar");
		map.put(1002, "Samir Ranjan Rout , Bhubaneswar");
		map.put(1001, "Samir Rout ,Bhubaneswar");
		map.put(1002, "Samir Ranjan Rout , Bhubaneswar");
		map.put(1001, "Samir Rout ,Bhubaneswar");
		map.put(1002, "Samir Ranjan Rout , Bhubaneswar");
		map.put(1003, "sam , Bangalore");
		
		System.out.println(map.size());
		for(int i:map.keySet()) {
			System.out.println(i);
			System.out.println(map.get(i));
			System.out.println();
		}
	}
}
