package demoprograms;

public class pract {

	public static void  main(String[] args) {

		int[] A= {2,3,4,6,8,9};
		int special = 0;
		
		
		for(int i=0;i<A.length;i++) {
			for(int j=0;j<A.length;j++) {
				if(i!=j ) {
					break;
				}
				else if(A[i]%A[j]==0 && i!=j) {
					special++;
				}
			}
			
		}
		System.out.println(special);
		
	}
	

}
