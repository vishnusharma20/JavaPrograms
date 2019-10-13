package demoprograms;

import java.util.Arrays;

public class ClosestZero {

	public static void main(String[] args) {

		int[] A = { 2,5,-7, -3,-2}; // 0,1,2,2,3,3
		int[] B = new int[A.length];

		/*for (int i = 0; i < A.length; i++) {
			B[i] = Math.abs(A[i]);
		}
		Arrays.sort(B);
		for (int j = 0; j < B.length; j++) {
			if (A[j] == B[0]) {
				System.out.println(A[j]);
			}
			if (A[j] == -1 * B[0] && A[j] != 0) {
				System.out.println(A[j]);
			}
		}*/
		
		/*for (int i = 0; i < A.length; i++) {
			B[i] = Math.abs(A[i]);
		}*/
		
	//	Arrays.sort(A);
		int diff=0;
		int minimun=Integer.MAX_VALUE;
		
		for(int i=0;i<A.length;i++) {
			diff=Math.abs(A[i]-0);
			
			if(diff<minimun) {
				minimun=diff;
				
			}
		}
		for(int i=0;i<A.length;i++) {
			diff=Math.abs(A[i]-0);
			
			if(diff==minimun ) {
				System.out.println(A[i]);
				
			}
		}
		

	/*	int[] A= {5,4,3,2};
		Arrays.sort(A);
		
		int diff=0;
		int minimun=Integer.MAX_VALUE;
		
		for(int i=0;i<A.length-1;i++) {
			diff=A[i+1]-A[i];
			if(diff < minimun) {
				minimun=diff;
			}
		}
		for(int i=0;i<A.length-1;i++) {
			diff=A[i+1]-A[i];
			if(diff==minimun) {
				System.out.println(A[i]+" "+A[i+1]);
			}
		}*/
	}

}