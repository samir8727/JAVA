import java.io.File;

public class fileCreation {
	
	public static void main(String[] args) {
		File file=new File("helloWorld.txt");
		
		if(file.exists()) {
			System.out.println("this file is already exist");
			System.out.println("file path is - "+file.toPath());
			System.out.println(file.getFreeSpace());
			System.out.println(file.isDirectory());
			System.out.println(file.listFiles());
		}
		else {
			file.mkdir();
			if(file.canWrite()) {
				System.out.println("yes u can write this file");
				
			}
			else {
				file.setWritable(true);
				System.out.println("no you can not write any thing this file is write protected");
				//file.setWritable(true);
			}
		}
		
	}

}
