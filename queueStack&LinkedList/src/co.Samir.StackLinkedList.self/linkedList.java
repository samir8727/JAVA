package StackUsingLinkedList;

public class linkedList {
	public Node head;
	
	Node first=null;
	Node last=null;
	
	public boolean isEmpty() {
		if(first==null && last==null)
			return true;
		else
			return false;
	}
	public void push(int data) {
		Node newNode=new Node(data);
	
		if(isEmpty()) {
			first=newNode;
			System.out.println("Successfully added the first element in \"stack\" - " +data);
			
		}
		else {
			Node temp=first;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newNode;
			System.out.println("Successfully added Element - "+data);
		}	
	}
	
	public Node clear() {
		if(isEmpty()) {
			System.out.println("Operation is not avilable(\"this stack is empty \")");
		}
		else {
			Node temp=first;
			while(temp.next!=null) {
				temp=first.next;
				first=temp.next;
			}
			//first=temp.next;
			//temp=first.next;
			
		}
				return first;
		
	}
	
	public Node pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
		}
		else {
			
			Node temp=first;
			first=first.next;
			
		}
		return first;
	}
	
	public void display() {
		if(isEmpty())
			System.out.println("this stack is Empty");
		else {
			Node temp=first;
			while(temp!=null) {
				temp.displayNode();
			temp=temp.next;
			}
		}
	}

}
