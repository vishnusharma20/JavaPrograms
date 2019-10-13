package demoprograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class arraychcount {
	
	
	/* static void reverse(int a[] ,int start, int end ) {
		
		while(start<end) {
			
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
		}	
	}
	
	 static void rotate(int a[] , int d , int n) {
		reverse(a , 0 ,d-1);
		reverse(a , d ,n-1);
		reverse(a, 0 , n-1);
		
	}
	 
	 static void print(int a[],int size) {
		 
		 for(int i=0; i<size;i++) {
			 System.out.print(a[i]);
		 }
	 }*/
	
	

	public static void main(String[] args) {
		
		String name="INDIA";
		
		char[] arr=name.toCharArray();
		
		LinkedHashMap<Character, Integer> map= new LinkedHashMap<Character, Integer>();
		
		for(char a: arr) {
			int count=0;
		if(map.containsKey(a)) {
			map.put(a, map.get(a)+1);
			//count++;
		//	System.out.println(map.get(a));
			
		}
		else
			map.put(a, 1);

	}
		
	for(Entry<Character, Integer> entry: map.entrySet()) {
			
	//	System.out.println(entry.getKey() +""+ entry.getValue());
		
		if(entry.getValue()==1) {
			System.out.println(entry.getKey());
			break;
		}
		
	}
	
	
		
		//ROtate an array;
		
		/*int a[]= {1,2,4,5,6,7};
		int n= a.length;
		
		rotate(a, 2, n);
		print(a, n);*/
		
		
		
		
		
		
		
		
	}
}
