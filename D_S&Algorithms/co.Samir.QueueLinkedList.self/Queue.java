package queueUsingLinkedlist;

public class Queue {
linkedlist newLink=new linkedlist();
public void enqueue(int data) {
	newLink.Enqueue(data);
}
public void dequeue() {
	newLink.Dequeue();

}

public void Clear() {
	newLink.clear();
	
}
public void Size() {
	newLink.size();
}
public void display() {
	newLink.Display();
	System.out.println();
}
//public boolean IsEmptey() {
//	return newLink.isEmpty();
//}

}
