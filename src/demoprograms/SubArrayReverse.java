package demoprograms;

public class SubArrayReverse {
	
	static void rotate(int arr[] , int n , int d ) {

		for(int i=0;i<n;i+=d) {
		int l=i;
		int r=i+d-1;
		//int r=Math.min(i+d-1, n-1);
		
		while(l<r) {
			int temp=arr[l];
			arr[l]=arr[r];
			arr[r]=temp;
			l++;
			r--;
		}
		
	}
	}
 static void print(int a[],int size) {
		 
		 for(int i=0; i<size;i++) {
			 System.out.print(a[i]);
		 }
	 }

	public static void main(String[] args) {
		
		
		int[] arr= {2,3,4,1,4,5,2,4,5};

		int n= arr.length;
		int d=3;
		
		rotate(arr,n,d);
		print(arr,n);
	}

}
