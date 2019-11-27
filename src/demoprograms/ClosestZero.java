package demoprograms;

import java.security.AlgorithmConstraints;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class ClosestZero {

	public static void main(String[] args) {

		int[] A = { 2,5,-7, -3,1,-2,-1}; // 0,1,2,2,3,3
	
		
	//	Arrays.sort(A);
		int diff=0;
		int minimun=Integer.MAX_VALUE;
		int result=0;
		
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
				//result=A[i];
				
			}
			
		}
	//	System.out.println(result);

		//*******************************SOrt the URLs**************************
		
		/*ArrayList<String> al= new ArrayList<>();
		al.add("z");
		al.add("z");
		al.add("b");
		al.add("h");
		al.add("a");
		al.add("a");
		al.add("g");
		al.add("g");
		al.add("g");
		
		//System.out.println(al);
		
		Map<String,Integer> hm= new HashMap<>();
		for(String s: al ) {
			int count=0;
			if(hm.containsKey(s)) {
				hm.put(s, hm.get(s)+1);
			}
			else {
				hm.put(s, 1);
			}
		}
		
		
		
		//Set<Entry<String, Integer>> set = hm.entrySet();
	//	System.out.println(set.size());
		
		ArrayList<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(hm.entrySet());
        Collections.sort(list , new Comparator<Map.Entry<String, Integer>>()
        {
            public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
            {
                return (o2.getValue()).compareTo( o1.getValue() );
            }
        } );
        for(Map.Entry<String, Integer> entry:list){ 
        	
            System.out.println(entry.getKey());
        //    String data=entry.getKey();
        }
		
	}*/
}
}