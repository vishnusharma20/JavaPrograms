package demoprograms;

import java.util.Scanner;

public class HarckerRank {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
        Integer N = s.nextInt();             // Reading input from STDIN
      //  System.out.println("Hi, " + name + "."); */   // Writing output to STDOUT

       // int N = 15;
        int i=1;
        while(i<=N) {
        	
        	if(i%3==0) {
        		System.out.println("Fizz");
        		i++;
        	}
        	else if(i%5==0) {
        		System.out.println("Buzz");
        		i++;
        		
        	}
        	else if(i%5==0 && i%3==0) {
        		System.out.println("FizzBuzz");
        		i++;
        		
        	}
        	else {
        		System.out.println(i);
        		i++;
        		
        	}
        	
        }
	}

}
