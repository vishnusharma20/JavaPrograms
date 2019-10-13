package LinkedList;

public class LoopInLinkedList {
	
	Node head;
	
	class Node{
		
		Node next;
		int data;
		
		Node(int d){
			data=d;
			next=null;
		}
	}
	
	void push(int data) {
		
		Node new_node= new Node(data);
		
		new_node.next=head;
		head=new_node;
	}
	
		int detectLoop() {
		Node slow=head;
		Node fast=head;
		while(slow!=null && fast!=null && fast.next!=null) {
			
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast) {
				System.out.println("found loop");
				return 1;
			}
		}
		System.out.println("No loop");
		return 0;
	}

	public static void main(String[] args) {
		
		LoopInLinkedList list = new LoopInLinkedList();
		list.push(2);
		list.push(3);
		list.push(6);
		list.push(8);
		list.push(10);
		
		//creating loop in the list
		list.head.next.next.next=list.head;
		
		list.detectLoop();
		

	}

}
