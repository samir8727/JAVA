package StackUsingLinkedList;

public class stackLinkedList {
	linkedList newLink=new linkedList();
	public void Push(int data) {
		newLink.push(data);
	}
	
	public void Pop() {
		newLink.pop();
		
	}
	public void Clear() {
		newLink.clear();
	}
	
	
	public void Display() {
		newLink.display();
	}
}
