package LinkedList;

public class DeleteNodeLinkedList {
	
	Node head;
	
	class Node{
		
		Node next;
		int data;
		
		Node(int d){
			data=d;
			next=null;
			
		}
	}
	
	//Deleting a linked list node 
	
	void deleteNode(int key) {
		
		Node temp=head;
		Node prev=null;
		if(temp!=null && temp.data==key) {   //If first node i.e head to be deleted
			head=temp.next;   //head changed
			return;
		}
		
		//traverse to find the node to be deleted
		while(temp!=null && temp.data!=key) {
			prev=temp; 
			temp=temp.next;
		}
		if(temp==null)   //if key is not present in the list
			return;
		
		prev.next=temp.next;
	}
	
	//count number of nodes in a liniked list
	
	int countNodes() {
		
		int count=0;
		Node curr=head;
		
		while(curr!=null) {
			
			count++;
			curr=curr.next;
		}
		return count;
	}
	public void push(int data) {
		
		Node new_node =new Node(data);
			new_node.next=head;
			head=new_node;
	}
	
	public void printList() {
		Node tempnode=head;
		while(tempnode!=null) {
			System.out.println(tempnode.data);
			tempnode=tempnode.next;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DeleteNodeLinkedList list= new DeleteNodeLinkedList();
		list.push(10);
		list.push(11);
		list.push(12);
		list.push(13);
		
		System.out.println("Before deletion list");
		list.printList();
	//	System.out.println(list.countNodes());
		
		list.deleteNode(11);
		
		System.out.println("after deteletion");
		list.printList();
	//	System.out.println(list.countNodes());

	}

}
