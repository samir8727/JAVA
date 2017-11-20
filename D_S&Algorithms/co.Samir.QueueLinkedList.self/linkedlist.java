package queueUsingLinkedlist;

import javax.imageio.metadata.IIOMetadataNode;

public class linkedlist {
	Node first=null;
	Node last=null;
	public boolean isEmpty() {
		if(first==null&&last==null)
			return true;
		else
			return false;
	}
	//Node last=null;
	
	//public boolean isEmpty() {
	//	if(first==last)
		//	return true;
	//	/else
	//		return false;
			
	//}
	
	public void Enqueue(int data) {
		Node newNode=new Node(data);
		if(first==null) {
			
			first=newNode;
			
			System.out.println("inserted first data on quiue -" +data);
		}
		else {
		Node temp=first;
		while(temp.next!=null) {
			temp=temp.next;
			
		}
		temp.next=newNode;
		System.out.println("Added successfuly Element - "+data);
			
		}	
		
	}
	
	public Node Dequeue() {
		Node temp=first;
		first=first.next;
		return temp;
		
	}
	
	public Node clear(){
		if (isEmpty())
			System.out.println("Queue is empty so clear option is not working over here");
		else {
			Node temp=first;
			while(temp.next!=null) {
				temp=first.next;
				first=temp.next;
			}
			System.out.println("clear everthing.....");
		}
	return first;
	}
	
//	public Node size() {
//		int count=0;
//		//Node node=new Node(data);
//		if(isEmpty())
//			System.out.println("size of queue is empty");
//		else {
//			Node node;
//			size(node.next)
//			
//				
//			}
//		}
//		System.out.println("size of queue is - "+count);
//	}
		
	
	public void Display() {
		if(isEmpty())
			System.out.println("Nothing to Display Plz add some item ..");
		else {
		Node temp=first;
		while(temp!=null) {
			temp.DisplayNode();
			temp=temp.next;
		}
	}
			
		
	}
	
	

}
