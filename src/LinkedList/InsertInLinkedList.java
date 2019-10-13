package LinkedList;

public class InsertInLinkedList {
	
	
	Node head;   //head of list
	
	class Node{
		
		int data;  
		Node next;
		
		Node(int d){        //consstructor
			data=d;
			next=null;
			
		}
	}
	
	//Insert  a new node in front of the list
	public void push(int new_data) {
		
		Node new_node= new Node(new_data);
		
		new_node.next=head;
		head=new_node;
	}
	
	public void insertAfter(Node prev_node, int new_data) {
		
		if(prev_node==null) {
			System.out.println("Previous node cant be null");
			return;
		}
		
		Node new_node= new Node(new_data);
		
		new_node.next=prev_node.next;
		
		prev_node.next=new_node;
		
		
	}
	
	public void append(int new_data) {
		
		Node new_node=new Node(new_data);
		
		//if linked list is empty make new node as head;
		if(head==null) {
			 
			head=new Node(new_data);
			return;
		}
		
		new_node.next=null;
		
		Node last=head;
		while(last.next!=null) 
			last=last.next;
		
		last.next=new_node;
		return;
	}
	
	public void printlist() {
		
		Node tnode=head;
		while(tnode!=null) {			
		System.out.println(tnode.data+ " ");
		tnode=tnode.next;
		}
	}

	public static void main(String[] args) {
		
		 InsertInLinkedList list = new  InsertInLinkedList();
		 list.append(6);
		 list.push(1);
		 list.append(8);
		 list.insertAfter(list.head.next, 7);
		 
		 list.printlist();

	}

}
