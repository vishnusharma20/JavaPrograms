package LinkedList;

public class DeleteOdd {
	
	Node head;
	
	class Node{
		Node next;
		int data;
		
		Node(int d )
		{
			data=d;
			next=null;
		}
	}
	void push(int data) {
		
		Node new_node = new Node(data);
		new_node.next=head;
		head=new_node;	
	}
	
	void printeven() {
		
		Node temp=head;
		
		if(head==null) {
			return;
		}
		
		while(temp!=null ) {
			if(temp.data%2==0) {
				System.out.println(temp.data);	
			}
			temp=temp.next;
		}
	}
	
	void printlist() {
		Node tnode= head;
		while(tnode!=null) {
			System.out.println(tnode.data);
			tnode=tnode.next;
		}
	}
	

	public static void main(String[] args) {
		
		DeleteOdd list = new DeleteOdd();
		list.push(1);
		list.push(2);
		list.push(3);
		list.push(4);
		list.push(5);
		list.push(6);
		
		list.printeven();
	}

}
