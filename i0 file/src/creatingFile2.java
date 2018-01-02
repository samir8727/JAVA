import java.io.File;
import java.util.Scanner;

public class creatingFile2 {
	public static void main(String[] args) {
		Scanner sc ;
		sc=new Scanner(System.in);
		System.out.print("Enter path of the file - ");
		String path=sc.nextLine();
		File file=new File(path);
		
		if(!file.isDirectory()) {
			System.out.println("this is not a directory");
		}
		else {
			File[] files = file.listFiles();
			for(File fi:files) {
				System.out.printf("[%s] %s\n",fi.isDirectory()? "dir":"file",fi.getName());
				if(fi.isFile()) {
					System.out.println(fi.getParentFile());
					System.out.println(fi.canExecute());
				}
			}
			sc.close();
		}
	}

}
