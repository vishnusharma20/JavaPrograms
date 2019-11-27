package LinkedList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class List {

	public static void main(String[] args) {
		
		ArrayList<Integer> list= new ArrayList<>();
		list.add(2);
		list.add(4);
		list.add(5);
		list.add(6);
		 
		int[] arr= new int[10];
		
		System.out.println(list);
		
	//	Iterator<Integer> itr= list.iterator();
		
		boolean sorted=true;
		for(int i=0;i<list.size()-1;i++) {
			if(list.get(i)>list.get(i+1)) {
				sorted=false;
				
				//System.out.println("False");
			}
		}
		if(sorted)
		System.out.println("True");
		else {
			System.out.println("false");
		}
			
		
		
	

	}

}
