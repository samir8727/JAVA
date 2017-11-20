
public class Stack_Arrays {
	public final int maxSize=5;
	int[] arrays=new int[maxSize];
	int size=0;
	int front=0;
	int rear=-1;

	public boolean IsEmpty() {
		if(front==0&&rear==-1)
			return true;
		else
			return false;
	}
	public boolean IsFull() {
		if(rear==maxSize-1)
			return true;
		else
			return false;
	}
	
	public void Push(int Element) {
		if(IsFull())
			System.out.println("Stack is overflow");
		else {
			rear++;
			arrays[rear]=Element;
			System.out.println("Element added successfully");
		}
		
	}
	
	public void Pop() {
		if(IsEmpty())
			System.out.println("Stack is Empty so the pop function is not occure");
		else {
			rear--;
			System.out.println("Element is deleted");
		}
			
	}
	
	public void Clear() {
		if(IsEmpty())
			System.out.println("Stack is Empty so clear function is not working at this stage");
		else {
			while(front<=rear)
				rear--;
			System.out.println("Clear everythig from Stack");
			
		}
	}
	
	public void Display() {
		if(IsEmpty())
			System.out.println("Nothig to display.sorry!! \"run this function latter\" GoodBye");
		else {
			System.out.println("Elements in \"Stack\"");
			for(int i=rear;i>=front;i--) {
				System.out.println(arrays[i]);
			}
		}
		
	}


}
