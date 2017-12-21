package co.samir.myprogram.test;
import co.samir.myprogram.*;

public class BookDemo {
	public static void main(String[] args) {
		Author author=new Author("Samir", "Rout");
		
		Book book1=new Book("I will become a devloper", author, 1000);
		System.out.println(book1.getTitle());
		System.out.println(book1.getName());
		System.out.println(book1.getPrice());
		
		String book=book1.toString();
		System.out.println(book);
	}

}
