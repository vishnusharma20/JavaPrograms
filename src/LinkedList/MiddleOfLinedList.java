package LinkedList;

public class MiddleOfLinedList {
	
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
	void printlist() {
		Node tnode=head;
		
		while(tnode!=null) {
			System.out.println(tnode.data);
			tnode=tnode.next;
		}
	}
	
	void findMiddle() {
		
		Node slow=head; 
		Node fast=head;
		
		if(head!=null)
		{
		while(fast.next!=null && fast.next.next!=null) {      // when fast.next=null then it has odd node else even
		
			fast=fast.next.next;
			slow=slow.next;
		}
		System.out.println("middle element is"+  slow.data);
	}
	}

	public static void main(String[] args) {
	
		MiddleOfLinedList list = new MiddleOfLinedList();
		
		for(int i=1;i<10;i++) {
			list.push(i);
		}
		list.printlist();
		list.findMiddle();

	}

}
