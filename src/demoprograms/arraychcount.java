package demoprograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Stack;

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
		
	//	String name="zztqooauhujtmxnsbzpykwlvpfyqijvdhuhiroodmuxiobyvwwxupqwydkpeebxmfvxhgicuzdealkgxlfmjiucasokrdznmtlwh";
		//tqauhujtmxnsbzpykwlvpfyqijvdhuhirdmuxiobyvxupqwydkpbxmfvxhgicuzdealkgxlfmjiucasokrdznmtlwh
		String name="aaccaabbbaad";
		
		
		Stack<String> st= new Stack<String>();
		
		st.push(name);
		System.out.println(st);
		
		
		
		
		//char[] arr=name.toCharArray();
		
	/*	for(int i=0;i<name.length()-2;i++) {
			
			
			if(name.charAt(i)==name.charAt(i+1))  
			name=name.substring(0,i)+name.substring(i+2,name.length());
			
			i=i-1;
		}
		System.out.println(name);*/
		/*for(int i=0;i<arr.length;i++) {
			if(arr[i]==arr[i+1])
				break;
				i=i+2;
		}*/
		
		/*LinkedHashMap<Character, Integer> map= new LinkedHashMap<Character, Integer>();
		
		for(char a: arr) {
			int count=0;
		if(map.containsKey(a)) {
			map.put(a, map.get(a)+1);	
		}
		else
			map.put(a, 1);
	}
		
	for(Entry<Character, Integer> entry: map.entrySet()) {
		if(entry.getValue()%2!=0) {
			System.out.print(entry.getKey());
			
		}
		
	}*/
	
	
		
		//ROtate an array;
		
		/*int a[]= {1,2,4,5,6,7};
		int n= a.length;
		
		rotate(a, 2, n);
		print(a, n);*/
		
		
		
		
		
		
		
		
	}
}
