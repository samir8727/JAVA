import java.util.regex.Pattern;

public class demo2 {
	public static void main(String[] args) {
		String name="samir@gahjahha";
		Pattern p=Pattern.compile("[A-Za-z0-9]");
		
		System.out.println(p.matcher(name).find());
		
	
	}

}
