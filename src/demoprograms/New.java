package demoprograms;

import java.util.HashSet;

public class New {
	
	
	 public static void main(String[] args)
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
	 
	 {
		 
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
	 }
}