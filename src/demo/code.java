package demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;

public class code {
	
	
	public static void main(String args[]) {
		
	/*//	int[] arr= {1,3,3,3,5,2,3,2,1,1,1,4};
		String s= "A";
		String s4="A";
		String s1 = new String("A") ;
		String s2 =  new String("A") ;
		String s3=s1.intern();
		
		
		System.out.println(s==s1);  //false
		System.out.println(s.equals(s1));    //true
		System.out.println(s3==s);  //true
		System.out.println(s3.equals(s));  //true
		System.out.println(s==s4);  //true
		System.out.println(s.equals(s4));*/
		
		//****************************************************************
	/*HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
	
	for(int a : arr)
	{
		if(hmap.containsKey(a))
		{
			hmap.put(a, hmap.get(a)+1);
		}
		else
		{
			hmap.put(a, 1);
		}
	}
	
	Set<Entry<Integer,Integer>> entry = hmap.entrySet();
	
	Iterator i = entry.iterator();
	
	while(i.hasNext())
	{
		Map.Entry m= (Map.Entry) i.next();
	}
	System.out.println();
			*/
			
	/*	String str="(VISH)";
		
		 int sum = 0;
		 
		  for(int i=0; i < str.length(); i++) {      
		    
		    if(str.charAt(i) == '('){
		      sum += 1;
		    } else if(str.charAt(i) == ')'){
		    		sum -= 1;  
		    }
		  }
		  
		  if(sum==0) {
			  System.out.println("Balanced");
		  }
		  else
			  System.out.println("Not balanced");*/
	//	char[] arr= name.toCharArray();
		
		
		/*Stack stack= new Stack();
		
		for(int i=0;i<name.length();i++) {
		if(name.charAt(i)=='(')
		{
			stack.push(name.charAt(i));
		}
		
		if(name.charAt(i)==')')
		{
			if(stack.isEmpty() ) {;
			
			System.out.println("No");
			}
		}
		
		Character top=(Character) stack.pop();
		
		if(top=='('&& name.charAt(i)!=')') {
			System.out.println("Nooo");
		}
}
		if(stack.isEmpty()) {
			System.out.println("balaced");
		}
		else
			System.out.println("Not balanced");*/
}
}
