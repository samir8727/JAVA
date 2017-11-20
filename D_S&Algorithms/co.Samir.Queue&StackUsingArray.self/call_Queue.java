
public class call_Queue {
	public static void main(String[] args) {
		queue_Arrays queue=new queue_Arrays();
		System.out.println(queue.IsFull());
		
		Stack_Arrays stack=new Stack_Arrays();
		System.out.println(stack.IsEmpty());
		stack.Push(8);
		stack.Push(10);
		stack.Push(89);
		stack.Push(81);
		stack.Push(899);
		
		stack.Pop();
		//stack.Push(49);
		//stack.Clear();
		
		//stack.Push(89);
		
		stack.Clear();
		
		stack.Display();
		
	
		
		
		
		
		
		
	}

}
