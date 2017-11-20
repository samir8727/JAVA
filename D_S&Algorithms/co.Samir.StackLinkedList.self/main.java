package StackUsingLinkedList;

public class main {
	public static void main(String[] args) {
		stackLinkedList stack=new stackLinkedList();
		
		stack.Push(789);
		stack.Push(876);
		
		stack.Push(389);
		stack.Push(76);
		
		stack.Push(789);
		stack.Push(876);
		
		stack.Push(389);
		stack.Push(76);
		//stack.Display() ;
		
		//stack.Clear();
		
		//stack.Display() ;
		
		//stack.Display();
		
		stack.Pop();
		
		stack.Display();
	}

}
