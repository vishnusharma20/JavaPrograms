package demoprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class demo {

	public static void main(String[] args) {
		
		//print a 3*3 matrix and sum of its diagonal
		/*int[][] array = new int[3][3];
		int count=1;
		int sum=0;
		int sum1=0;
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=2;j++) {
				
				array[i][j]=count;
				System.out.print(array[i][j]);
				count++;
				if(i==j) {
					sum=sum+array[i][j];
				}
				if((i+j)==(2))
				{
				sum1=sum1 + array[i][j];
			}}
			
			System.out.println("");
		}
		System.out.println("sum of a diagonal of matrix"+sum+"  "+sum1);
		
		 int principal = 0, secondary = 0;  
	        for (int i = 0; i < 3; i++) { 
	            principal += array[i][i]; 
	            secondary += array[i][3 - i - 1];  
	        } */

		// seperate 0's and 1's in an arrya
		
	/*	int[] arr= {1,1,0,0,0,1,0};
			
		int n=arr.length;
		int count=0;
		
		for (int i=0; i<n;i++) {
			if(arr[i]==0) {
				count++;
			}	
		}
		
		for(int i=0;i<count;i++) {
			arr[i]=0;
		}
		for(int i=count;i<n;i++) {
			arr[i]=1;
		}
		
		for(int i=0;i<n;i++) {
		System.out.println(arr[i]);
	}}

		
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++)
			if(arr[i]>arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		
		for(int j=0;j<n;j++) {
			System.out.println(arr[j]);
		}
		*/
		
	//next palindrome of a number
	
	/*	for(int i=0;i<10000;i++) {	
			int num=12322+i;
			int reverse=0;
			int temp=num;
		while(num>0) {
			
			int rem=num%10;
			reverse=reverse*10 + rem;
			num=num/10;
		}
		
		if(reverse==temp) {
			System.out.println("Next palindrome number is" +reverse);
			//System.out.println(reverse);
			break;
		}
		else {
			
			//System.out.println("Next number is "+temp+" no palindrome ");
		//	System.out.println(num);
		}
	
		//System.out.println(temp);
		
	
		}	*/
		
		//separate even and odd numbers in an array
		
		/*int[] a= {2,1,9,2,3,4,5,6,7,8};
		 
		 for(int i=0;i<a.length;i++)
	        {
	            for(int j=i+1;j<a.length;j++)
	            {
	                int temp;
	                if(a[i]%2!=0 && a[j]%2==0 && j>i)
	                {
	                    temp=a[j];
	                    a[j]=a[i];
	                    a[i]=temp;
	                        //There seems to be some problem in this loop
	                }
	            }
	            System.out.print(a[i]);
	        }*/
		
	/*	int[] array= {2,1,9,2,3,4,5,6,7,8};
		Map<Integer, Integer> map= new HashMap<Integer,Integer>();
		
		for(int a1: array) {
		if (a1%2==0) {
			int count=0;
			map.put(a1, map.get(a1));
			count++;
		}
		}
		
		for(Entry<Integer, Integer> e : map.entrySet()) {
			System.out.println(e.getValue());
		}*/
		//product of an array 
		/* int[] a= {1,2,3,4,5}; 
		 int prod=1;
		 
		 for(int i=0;i<a.length;i++) {
		
			 prod=prod*a[i];
			 
		 }
		 for(int i=0;i<a.length;i++) {
		 a[i]=prod/a[i];
		 System.out.println(a[i]);
		 }*/
		
	/*int[] a= {1,2,1};
	int k=2;
	
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
		
			System.out.println(a[i]+" "+a[j]);
		}
	}*/
		
		////Print a pattern right angle
		
	/*	for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}*/
		
		//********triangle pattern******diamond pattern****
		
	/*	for(int i=1;i<=5;i++) {			//This loop decides the no of lines to be printed
			for(int j=4;j>=i;j--) {     //This loop prints spaces
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++) {  //This loop prints stars
				System.out.print("*");
			}
			System.out.println("");      //shift to next linw
		}
		for(int i=4;i>=1;i--) {
			for(int j=4;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("*");
			}
			System.out.println("");
		}*/
		
		//opposie to the above programme
		/*for(int i=1;i<=5;i++) {			
			for(int j=4;j>=i;j--) {     
				System.out.print("*");
			}
			for(int k=1;k<=2*i-1;k++) {  
				System.out.print(" ");
			}
			System.out.println("");      
		}
		for(int i=4;i>=1;i--) {
			for(int j=4;j>=i;j--) {
				System.out.print("*");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print(" ");
			}
			System.out.println("");
		}*/
	
		//***********************************
		
	/*	int n=5;
		
		int count=0;
		for(int i=n; i>=1;i--) {
			System.out.print(i);
		}
		for(int i=2; i<=n;i++) {
			System.out.print(i);
		}*/
		
		//**************duplicates in an array**************************
		
	
		/* int[] arr= {6,2,2,3,4,1,4,1,5,6,6};
		 int sum=0;
		 for(int i=0;i<arr.length;i++)
			{
				int count=0;
				
				for(int j=0;j<arr.length;j++)
				{
					if(arr[i]==arr[j] && j<i)
					{
						break;
						
					}
					else if(arr[i]==arr[j])
						//temp=arr[i];
						count++;
				}
				if(count>0) {
					
					//System.out.println("Total duplicate socks"+ count+"pairs of socks"+count/2);}
					sum=sum+count/2;
					
				
				//	System.out.println("Duplicate elements are"+ arr[i]+" repeated " +count+ "times");
				//System.out.println(arr[i]+"---"+count);
			}
				
				}
		 System.out.println(sum);
				*/
		
		
		//********************
		
		/*String a="vishnu sharma";
		char[] arr=a.toCharArray();
		int count=0;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]=='a' || arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u') {
				
				count++;
			System.out.print(arr[i]); //print vowels
			}
			else
				System.out.print(arr[i]); //prinr constants
		}
		*/
		
		
		//******************Duplicatie in an array using Map************************************
		/*int[] arr= {8,8,8,6,2,8,6,2,1,1,4};
		int count=0;
		int sum=0;
		Map<Integer,Integer> map= new HashMap<Integer,Integer>();
		
		for(int a: arr) {
			if(map.containsKey(a)) {
				count=map.get(a);
				System.out.println(count);
				map.put(a, count+1);
				//map.remove(a);
				//System.out.println(map);
			}
			else {
				map.put(a, 1);
			}
		}
		
		for(Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue()>1) {
				//System.out.println(entry.getKey()+" count"+entry.getValue());
				sum= sum + (entry.getValue())/2;
				
		}
		}*/
		//System.out.println(sum);
		
		
		//*
		
		/*String a= "azxxzy";
		//String a= "acaaabbbacddd";
		
		char[] arr=a.toCharArray();
		char[] temp = new char[arr.length];*/
		
		/*Map<Character,Integer> map =new HashMap<Character, Integer>();
		
		for (char c : arr) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else
				map.put(c, 1);
		}
		
		for(Entry<Character,Integer> entry: map.entrySet()) {
			if(entry.getValue()==1) {
				System.out.print(entry.getKey());
			}
		}*/
	       /*String str = "aabcdefhhhuid";

	        char c[] = new char[256];

	        for ( int i=0;i<str.length();i++)
	        {
	            c[str.charAt(i)] = (char) (c[str.charAt(i)]+ 1);
	           
	        }
	      //  System.out.println((int)c['a']);
	        for ( int i=0 ;i<c.length;i++)
	        {
	            if( c[i]>1)
	            {
	                System.out.println((int)c[i]+ "---"+(char)i) ;
	            }
	        }

	    }*/
		
		//********Array rotation**********
		
		/*int[] arr= {1,2,3,4,5};
		int n=arr.length;
		int i=0;
		
		while (i<n) {
			int tem=arr[i];
			arr[i]=arr[n-1];
			arr[n-1]=tem;
			i++;
			n--;
			
		}
		for(int j=0;j<arr.length;j++) {
			System.out.println(arr[i]);
		}*/
		
		
		/*int[] arr= {0,0,0,1,0,1,0};
		int l=arr.length;
		int count=0;
		for (int i=0;i<l;i++) {
			if(i+2<l && arr[i+2]==0) {
				i++;
			}
			count++;
		}
		System.out.println(count-1);*/
		
		//String s="aba";
		/*int n=10;
		String a="";
		
		
		
		while(s.length()<n) {
		s= s.concat(s);
		}
		a=s.substring(0,n);
		
		char[] arr=a.toCharArray();
		
		Map<Character,Integer> map= new HashMap<Character,Integer>();
		
		for(char c: arr) {
		if(map.containsKey(c)) {
			map.put(c,map.get(c)+1);
		}
		else
			map.put(c, 1);
		}
		
		for(Entry<Character,Integer> entry:map.entrySet()) {
			if(entry.getKey()>1)
				System.out.println(entry.getKey() +" repeated "+ entry.getValue());
		}*/
		
		//************************
	/*	String s="a";
		long n=100000000L;
		String a="";
		long count=0;
		try {
			while(s.length()<n) {
				s= s.concat(s);
				}
				a=s.substring(0,(int) n);
				char[] arr=a.toCharArray();
				
			for(int i=0;i<arr.length;i++) {
			if(arr[i]=='a') {	
				count++;
			}
			}
			System.out.println(count);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		    
		//int[] arr= {1,2,3,4,5};
		//int start = 0;
		//int end=arr.length;
		//int d=2;
	//	int temp;
		
		
		
		
	
		
		
}
		
}