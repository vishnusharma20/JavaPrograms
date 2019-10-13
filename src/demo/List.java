package demo;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
		 
		
	//	ArrayList list= new ArrayList();
		/*
		ArrayList list = new ArrayList(2);
		list.add(1);
		list.add(2);
		list.add("A");
		list.add(null);
		
		System.out.println(list);*/
		
		String name="a!b@c#def$";	
		
		char[] arr=name.toCharArray();
		
		int l=0;
		int r=arr.length-1;
		
		while(l<r) {
			if(!Character.isAlphabetic(arr[l])) {
				l++;
			}
			else if(!Character.isAlphabetic(arr[r])) {
				r--;
			}
			else {
				char tmp=arr[l];
				arr[l]=arr[r];
				arr[r]=tmp;
				l++;
				r--;
			}
			
		}
		
		/*for(int i=0;i<=r;i++) {
			System.out.print(arr[i]);
		}*/
			
		String revStr = new String(arr); 
		  
        System.out.println("Output string: " + revStr);
		
		
		

		
			 
	}

}
