
public class queue_Arrays {
	
		public final int maxsizeArray=5;
		int[]arrays=new int[maxsizeArray];
		int size=0;
		int front=0;
		int rear=-1;
		public boolean IsEmpty() {
			if(front==-1 && rear==0)
				return true;
			else
				return false;
			
		}
		public boolean IsFull() {
			if(rear==maxsizeArray-1)
				return true;
			else
				return false;
		}
		
		public void Enqueue(int insert) {
			if(IsFull())
				System.out.println("Queue is full");
				
				else {
					rear++;
					arrays[rear]=insert;
					System.out.println("element inserted- "+insert);
					
				}
				
	
		}
		public void Dequeue() {
			if(IsEmpty())
				System.out.println("Queue is empty");
			else {
				front++;
				System.out.println("Deleted");
			}
		}
		
		public void Size() {
			size=rear+1;
			System.out.println("Queue size is "+size);
			
		}
		
		public void clear() {
			if(IsEmpty())
				System.out.println("Queue is empty so clear method is not applicable here");
			else {
				while(front<=rear)
				front++;
				System.out.println("clear everything");
			}
			
		}
		
//		public void Display() {
//			if(front<=rear) {
//				System.out.println("Queue elements are");
//				for(int i=front;i<=rear;i++) {
//					System.out.println(arrays[i]);
//				}
//			}
//		}
		
		 public void display() {  
			  if (rear >= front) {  
			   System.out.println("Elements in Queue : ");  
			   for (int i =front; i <= rear; i++) {  
			    System.out.println(arrays[i]);  
			   }  
			  }  
}
}