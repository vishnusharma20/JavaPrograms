package demoprograms;

public class NearestPalindrome {

	public boolean isPalindrome(int num) {
		int rev=0;
		int temp = num;
		
		while(num>0) {
			int rem=num%10;
			rev= (rev*10) + rem;
			num=num/10;
		}
		
		return temp==rev ? true : false	;
	}
	
	public int closest(int o)
		{
		int lower=o-1;
		while(!isPalindrome(o)) {
			o--;
		}
		
		int higher=o+1;
		while(!isPalindrome(o)) {
		o++;	
		}
		
		if (o - lower > o - higher) 
		    return lower; 
		  else
		    return higher; 
		
		}
	
	public static void main(String[] args) {
		
		
		NearestPalindrome nc= new NearestPalindrome();
		nc.closest(123);
		
		

		
		
		
	}

}
