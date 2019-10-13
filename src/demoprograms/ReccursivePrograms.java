package demoprograms;

public class ReccursivePrograms {
	
	//**********fibonaci number**********
	
	 static int fibo(int x) {
		if(x<=1) {
			return x;
		}
	
		return fibo(x-1) +fibo(x-2);
	}
	
	//********Factorial***********
	
	/*static int fact(int x) {
		if(x<1)
			return 0;
		if(x==1)
			return x;
		return x*fact(x-1);
	}*/
	
	//***********reverse a string**********
	
	/*public static void swap(char[] arr ,int i, int l) {
		char temp=arr[i];
		arr[i]=arr[l];
		arr[l]=temp;
	}
	
	public static void reverse(char[] arr ,int i, int l) {
		
		if (i<l) {
			
			swap(arr,i,l);
			reverse(arr,i+1,l-1);
		
		}
	}*/
	
	//*********Recursively remove adjacents duplicates in a string
	
	
	
	
	public static void main(String args[]) {
		
		System.out.println(fibo(6));
		//System.out.println(fact(4));
		
		/*String a="vishnu";
		char[] arr=a.toCharArray();
		
		reverse(arr,0,arr.length-1);
		a=new String(arr);
		System.out.println(arr);
	}*/
	
}
	}
