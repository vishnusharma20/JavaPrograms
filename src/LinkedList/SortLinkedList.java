package LinkedList;

import LinkedList.IntersectionLinkedList.Node;

public class SortLinkedList {
	
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
	
	void sorting() {
		
		Node i=head;
		Node j=head.next;
		int temp;
		
		for(i=head;i!=null;i=i.next) {
			for(j=i.next;j!=null;j=j.next) {
				if(i.data>j.data) {
					temp=i.data;
					i.data=j.data;
					j.data=temp;
				}
				
			}
		}
	}
	

	public static void main(String[] args) {
		
		SortLinkedList list= new SortLinkedList();
		 
		list.push(5);
		list.push(6);
		list.push(1);
		list.push(3);
		
		System.out.println("Before sorting");
		list.printlist();
	
		list.sorting();
		
		System.out.println("After sorting");
		list.printlist();
		
		
		

	}

}
