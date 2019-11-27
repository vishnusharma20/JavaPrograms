package demo;

public class LeaderInArray {

	public static void main(String[] args) {
		
		
		int[] arr= {3,5,1,4,9,10,5,6};
		
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					flag=false;
					i++;
				}
				else  {
					flag=true;
					
					
				}
			}
			if(true) {
				System.out.println(arr[i]);
			}
		}
		
		
		

	}

}
