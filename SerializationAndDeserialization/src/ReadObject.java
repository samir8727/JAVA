import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadObject {
	public static void main(String[] args)throws Exception {
		FileInputStream file=new FileInputStream("Employee.data") ;
		ObjectInputStream in=new ObjectInputStream(file);	
		
		while (true) {
			try {
				Object obj = in.readObject();
				System.out.println(obj);
			} catch (EOFException e) {
				//e.printStackTrace();
				break;
			}
		}
		
		in.close();
		file.close();
		System.out.println("Deserialiation successfully");
		
		
		
	}

}
