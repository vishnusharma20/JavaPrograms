package demoprograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class New {
	
/*	public void New(String i) {
		System.out.println("string");
		
	}
	public void New(Object o) {
		System.out.println("string1");
		
	}
	*/
	
	
	 public static void main(String args[]) {
		 
		
		
		 
		 /*Map<Integer, String> map = new HashMap<Integer, String>();
		 Hashtable<Integer, String> mtable= new Hashtable<>();
		 map.put(1, "Ram");
		 map.put(1, "Vishnu");  //same key but different value, it will override the 1st value and print second
		 System.out.println(map);
		 
		 mtable.put(1, "sam");
		 mtable.put(2, "sam");
		 System.out.println(mtable);
		 */
		
		/* String str= new String("abc");
		 String str1="abc";
		 
		 System.out.println(str.concat(str1));*/
		 
	  /*  {
	       String s="abcabcadesg";
	       int i=0;
	       int j=0;
	       int maxlength=0;
	       
	       HashSet<Character> set= new HashSet<Character>();
	       
	       while(j<s.length()){
	    	   if(!set.contains(s.charAt(j))){
	    		   set.add(s.charAt(j));
	    		   j++;
	    		   maxlength=Math.max(maxlength, j-i);	   
	    	   }
	    	   else{
	    		   set.remove(s.charAt(i));
	    	   		i++;
	    	   }
	       }
	       System.out.println(maxlength+"---"+set);
		}*/
	 
	/* {
		 
		 int num=15;
		 boolean flag=true;
		 for(int i=2; i<num/2;i++) {
			
			 if(num%i==0) {
				 System.out.println("not a prime");
				 flag=false;
				 break;
			 }
			
		 }
		 if(flag) {
			 System.out.println("prime");
		 }
	 }*/
}
}