import java.lang.reflect.Array;
import java.util.Arrays;

public class StringMethods {
	
//2 :Write a method which accepts a string as argument and returns the
//	first letter of every word clubbed into a string.
	
	public static String firstLatter(String str) {
		
		String firstlatters="";
		for(String i : str.split(" ")) {
			firstlatters+=i.charAt(0);
		}
//		
		return firstlatters;
	}
	
	
	
	//3. Write a method to reverse a string without using StringBuffer or StringBuilder.
	public static String reverseString(String str) {
		//without using StringBuffer or StringBuilder;
		String str1="";
		if(str==null || str.isEmpty()) {
			System.out.println("this str is empty");
		}
		else {
			
			for(int i=str.length()-1;i>=0;i--) {
				str1+=str.charAt(i);
			
			}
		}
		return str1;
	}
	
//	//4. A method which returns true if the email address is valid. Without using reg exp
//	public static boolean validEmail(String mailid) {
//		
//		if(mailid==null || mailid.isEmpty()) {
//			System.out.println("email is does not contains any charecter");
//		
//			String[] splitMail=mailid.split("");
//			if(splitMail[splitMail.length-1]=="@" || splitMail[0]=="@" || splitMail[splitMail.length-1]=="." || splitMail[0]==".") {
//				return false;
//			}
//		}
//				
//		
//		
//		else {
//		String[] splited1=mailid.split("@");
//		String domain=splited1[splited1.length-1];
//		String local=splited1[0];
//
//		String [] domineName= {"gmail.com","yahoo.com","live.com","mail","hotmail","felight","wipro"};
//		
//				for(int i=0;i<domineName.length;i++) {
//					if(domain==domineName[i]) {
//					}
//				}
//				return true;
//			
//		}
//		
//		return false;
//	}
//		//return true;
	
//	5. A method which returns the rating of a movie(1/5, 4/5) if a paragraph of text is given as a input.
//	Here you need to count all the +ve words like good, amazing, better etc and all 
//	the-ve words like bad, not good, worst etc and apply a logic to give a rating in number and return it.
	
	public static void ratingMovie(String description) {
		int count=0;
		int negetive=0;
		String[] splitMovieWords=description.split(" ");
		for(int i=0;i<splitMovieWords.length;i++) {
			if(splitMovieWords[i]=="good" ||splitMovieWords[i]=="amazing" || splitMovieWords[i]=="better") 
				count++;
				
//			if(splitMovieWords[i]=="bad"||splitMovieWords[i]=="notgood"||splitMovieWords[i]=="wrost") {
//				count--;
//			}
			System.out.println("movie rating is - "+ count+"/5");
		}
		
	}
	

//	7. Write a Program to check if a String is palindrome or not? For example an String e.g. 
//			â€œmadamâ€  is a palindrome but â€œbookâ€  is not palindrome. 
//			You also need to solve this question without taking any help from Java String API.
		
	public static boolean isPalindrime(String str) {
		String palindrimeNum="";
		for(int i=str.length()-1;i>=0;i--) {
			palindrimeNum+=str.charAt(i);
		}
		if(str.equals(palindrimeNum))
			return true;
		else
			return false;
	}
	
//	8. Write a Java program to check if two String are Anagram or not? You need to write method e.g. 
//	isAnagram(String first, String second) which will return true if second String is anagram of first string. 
//	An anagram must contain same number of characters and exactly same characters but on different order e.g. 
//	top and pot, or army and mary.
	
	public static boolean isAnagram(String first, String second) {
		
		if(first.length()!=second.length()) {
			System.out.println("both Strings are most be same length");
		}
		else {
			char[] ch1=first.toCharArray();
			char[] ch2=second.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			if(Arrays.equals(ch1, ch2)) {
				return true;
			}
			else
				return false;
		}
		return false;
		
	}
	
//	9. Write a method in Java to remove any character from String? 
//	For example you need to write method remove(String word, char removeThis),
//	this method should return an String without character, which is asked to remove. you can use indexOf(),
//	substring() and similar methods from String class, but your method must handle corner cases 
//	e.g. passing null or empty String, String containing just one character etc.
	
	public static String remove(String word,char removeThis) {
		int removeChar;
		String FinalString;
		if(word==null && word.isEmpty()) 
			System.out.println("you can't leave it empty ; you have add some charecter in it");
		else if(word.length()==1)
			System.out.println("your String should more than one charecter");
		else {
			removeChar=word.indexOf(removeThis);
			StringBuilder newWord=new StringBuilder(word);
			newWord.deleteCharAt(removeChar);
			FinalString=newWord.toString();
			
			return FinalString;
			
		}
			
		return null;
	}
//	10. Write a method to Split a comma separated String in Java?
//			if send vinay,noah as input put should be new String[]{â€œvinayâ€ ,â€ noahâ€ }
	
	public static String spilited(String commaSeparatedString) {
		String SplitedString="";
		String[] splits= commaSeparatedString.split(",");
		System.out.println("splits length :" + splits.length);
		for(String i : splits) {
			SplitedString+=i;
			
		}
//		String strings="";
//		for(String i: commaSeparatedString.split(",")) {
//			strings+=i.toString();
//			
//		}
		return SplitedString;
	}
//	11. Write Java program to print all permutations of a String 
//	e.g. passing â€œABCâ€  will print all permutations like â€œBCAâ€ , â€œCBAâ€  etc
	
	public static String permutations(String word) {
		String swap=" ",b,c;
		char a;
		int endIndex=word.length()-1;
		for (int i=0;i<endIndex;i++) {
			a=word.charAt(i);
			b=word.substring(0, a);
			c=word.substring(a+1, endIndex);
			swap=(" "+a+" "+b+" "+c);
			
		}
		//swap=(" "+a+" "+b+" "+c);
		return swap;
	}

	
	


	public static void main(String[] args) {
		ratingMovie("hey tge bat man movie is so good this concept is very nice");
		
	}
}


