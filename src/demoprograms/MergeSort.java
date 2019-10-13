package demoprograms;

public class MergeSort {

	public static void main(String[] args) {


		int[] arr = {8,4,5,2,9,1,7,3};
		
		int l=0,r=arr.length-1,m=(l+r)/2;
		int n1=m-l+1;  //4
		int n2=r-m;  //4
		
		//create temp array
		
		int L[] = new int[n1];
		int R[] = new int[n2];
		
		for(int i=0;i<n1;++i) {
			L[i]=arr[i+l];
		}
		
		for(int j=0;j<n2;++j) {
			R[j]=arr[m+1+j];
		}
		
		
		//Merge both the arrays
		int i=0;
		int j=0;
		int k=l;
		while( i<n1 && j<n2)
		{
			
			if(L[i]<=R[j])
			{
			arr[k]=L[i];
			i++;
			}
			else 
			{
				arr[k]=R[j];
				j++;
			}
			k++;
		}
		
		while(i<n1) {
			arr[k]=L[i];
			i++;
			k++;
			
		}
		while (j < n2) 
	    { 
	        arr[k] = R[j]; 
	        j++; 
	        k++; 
	    } 
		

		 for (int a=0; i<arr.length-1; ++i) 
	            System.out.print(arr[a] + " "); 
	        System.out.println(); 
	}

}
