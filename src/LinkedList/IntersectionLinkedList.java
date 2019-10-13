package LinkedList;

import java.util.HashSet;

import LinkedList.MiddleOfLinedList.Node;

public class IntersectionLinkedList {
	
Node head1;
Node head2;
	
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
		new_node.next=head1;
		head1=new_node;
	}
	void printlist() {
		Node tnode=head1;
		
		while(tnode!=null) {
			System.out.println(tnode.data);
			tnode=tnode.next;
		}
	}
	
	public int getCount() 
    { 
        Node temp = head1; 
        int count = 0; 
        while (temp != null) 
        { 
            count++; 
            temp = temp.next; 
        } 
        return count; 
    } 
	
	
	/* public static Node MegeNode(list n1, Node n2) 
	    { 
	        // define hashset 
	        HashSet<Node> hs = new HashSet<Node>(); 
	        while (n1 != null) { 
	            hs.add(n1); 
	            n1 = n1.next; 
	        } 
	        while (n2 != null) { 
	            if (hs.contains(n2)) { 
	                return n2; 
	            } 
	            n2 = n2.next; 
	        } 
	        return null; 
	    } */
	 
	public void intersection() {
		
		while(head1.next.next!=null && head2!=null) {
			if(head1.next.next.data==head2.data) {
				System.out.println(head2.data);
			}
		}
	}

	public static void main(String[] args) {

		IntersectionLinkedList n1= new IntersectionLinkedList();
		n1.push(1);
		n1.push(2);
		n1.push(3);
		n1.push(4);
		n1.push(5);
		n1.push(6);
	
	
		IntersectionLinkedList n2= new IntersectionLinkedList();
		n2.push(1);
		n2.push(2);
		n2.push(3);
		n2.push(10);
		
		n1.intersection();
		n2.intersection();
		
		
		
		
		
		
		

	}

}
