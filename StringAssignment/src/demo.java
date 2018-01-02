import java.util.regex.Pattern;

public class demo {
	public static void main(String[] args) {
		
	
		String name="@gmail.com";
		if(name==null || name.isEmpty()) {
			System.out.println("is empty");
			
		}
		if(name.startsWith("@")||name.endsWith("@") || name.startsWith(".")||name.endsWith(".")) {	
			System.out.println("mail is start or end with with \"@\" or \".\"...");
			
		}
		
		String[] splitedmail=name.split("@");
		String domine=splitedmail[splitedmail.length-1];
		String local=splitedmail[0];
		String[] localPartition=local.split("");
		if (splitedmail.length==2){
			String[] splitDomine=domine.split("[.]");
			String domineLast=splitDomine[splitDomine.length-1];
			String domineFirst=splitDomine[0];
			String[] domineName= {"gmail","yahoo","yahoomail","live","windows","hotmail","mail","felight","wipro"};
			if(domineLast=="in" || domineLast=="com") {
				for(int i=0;i<domineName.length;i++) 
					if(domineFirst==domineName[i])
						if(localPartition.length>1) {
							
							
									
						}
			}
			System.out.println("mail is valid");
		}
		else {
			System.out.println("local part of mail latter length should be more than 1");
		}
						
		
					
				
				
			}
			
			
			
			
		
			
		
		
	}

	
