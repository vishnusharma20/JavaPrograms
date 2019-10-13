package demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.testng.annotations.Test;

public class EqualCase {
	
	
	public static void main(String[] args) {
	int count=0;
	int temp=0;
	 int[] q = {2,1,5,3,4};
     for(int i=0;i<q.length-1;i++){
         for(int j=i+1;j<q.length;j++)
         {
         if(q[i]>q[j])
         {
             count++;
             
             temp=count;
         }
        
         }
      //   if(count>2)
            // System.out.println("Too");
            // else
            	// System.out.println(temp);
	}
    
     
	/* for(int i=0;i<q.length-2;i++) {
		 if(q[i]>q[i+1] && q[i]>q[i+2] ) {
			 
			 tcount++;
		 }
		 else {
			 System.out.println("Too chaotic");
		 }
		
	 }
	 System.out.println(tcount);*/
	 
	}   	
	
}

