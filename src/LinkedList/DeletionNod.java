package LinkedList;

public class DeletionNod {
	
	//Deleting a liked list node at a given position
	
	Node head;
	
	class Node {
		
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
	
	void deleteAtGivenPosition(int position) {
		
		Node temp=head;
		
		if(head==null)
			return;
		if(position==0) {
			head=temp.next;
			return;
		}
		
		for(int i=0;i<position-1;i++) {
			temp=temp.next;
		}
		
		if(temp==null && temp.next==null) //If position is more than number of nodes
			return;
		//temp.next is the node to be deleted and store the pointer to the next of the node to be deleted
		Node next=temp.next.next;
		temp.next=next;  //unlink the deleted ndoe
	}
	
	void deleteList() {
		
		head=null;
	}
	
	void printlist() {
		Node tnode=head;
		while(tnode!=null ) {
			System.out.println(tnode.data);
			tnode=tnode.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DeletionNod list= new DeletionNod();
		list.push(2);
		list.push(4);
		list.push(6);
		list.push(8);
		
		System.out.println("before deletion");
		list.printlist();

		list.deleteAtGivenPosition(0);
		list.deleteList();
		
		System.out.println("after deletion");
		list.printlist();
	}

}
