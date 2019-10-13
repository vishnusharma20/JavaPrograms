package LinkedList;

import LinkedList.DeletionNod.Node;

public class LinkedListDemo{
	
	Node head;
	
	class Node{
		  int data;
		 Node next;
		 
		 public Node(int d) {
			 data=d;
			 next= null;
		 }
	}
	
	void insert(int data) {
		
	Node new_node= new Node(data);
	new_node.next=head;
	head=new_node;
	}
	
	//reverse a linked list
	
	Node reverseList() {
		
		Node curr=head;
		Node next= null;
		Node prev=null;
		
		while(curr!=null) {
			
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		head=prev;
		return head;
	}
	
	void printlist() {
		Node tnode=head;
		while(tnode!=null ) {
			System.out.println(tnode.data);
			tnode=tnode.next;
		}
	}
	


	
	public static void main(String[] args) {
		
		/*LinkedList<String> list = new LinkedList<String>();
		list.add(0, "A");
		list.add(1,"B");
		list.add(2,"C");
		System.out.println(list);*/
		LinkedListDemo list = new LinkedListDemo();
		list.insert(12);
		list.insert(13);
		list.insert(14);
		list.insert(15);
		
		System.out.println("Linked list");
		list.printlist();
		
		list.reverseList();
		System.out.println("Reverse Linked list");
		list.printlist();
		
		//Node new_node= new Node();

	}

}
