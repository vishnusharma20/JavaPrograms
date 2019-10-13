package LinkedList;

import java.util.Stack;

public class palindromeLinkedList {
	
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
		
		Node n= new Node(data);
		n.next=head;
		head=n;
	}
	
	void printlist() {
		
		Node tnode= head;
		while(tnode!=null) {
			System.out.println(tnode.data);
			tnode=tnode.next;
		}
	}
	
	boolean checkPalindrome() {
		
		//first find the middle element then push to stack
		
		Node slow=head;
		Node fast=head;
		
		Stack<Node> s= new Stack<Node>();
		s.push(slow);
		
		while(fast.next!=null && fast.next.next!=null) {
			
			slow= slow.next;
			fast=fast.next.next;
			s.push(slow);
		}
		
		if(fast.next==null)   //means ll has odd elements
			s.pop();
		
	
		Node secondhalf =slow.next;
		while(secondhalf!=null) {
			if(s.pop().data!=secondhalf.data) {
				return false;
			}
			secondhalf=secondhalf.next;
		}
		return true;
		
	}
	
	public static void main(String[] args) {
		
		palindromeLinkedList list= new palindromeLinkedList();
		list.push(1);
		list.push(2);
		//list.push(4);
		list.push(5);
		list.push(2);
		list.push(4);
		
		System.out.println(list.head.data);     //node inserted in the last is head node
		System.out.println(list.head.next.data);
		
	//	list.printlist();
		
		System.out.println(list.checkPalindrome());
	}

}
