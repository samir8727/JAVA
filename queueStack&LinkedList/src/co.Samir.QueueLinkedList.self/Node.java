package queueUsingLinkedlist;

public class Node {
	int data;
	Node next;
	public Node(int size) {
		data=size;
		next= null;
	}
	public void DisplayNode() {
		System.out.println("item - "+data);
	}

}
