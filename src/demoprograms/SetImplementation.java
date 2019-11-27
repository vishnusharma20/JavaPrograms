package demoprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class SetImplementation {
	
	
	public ArrayList<String> sortedURL(ArrayList<String> all) {
		Map<String,Integer> hm= new HashMap<>();
		//String[] s1= new String[10];
		for(String s: all ) {
			int count=0;
			if(hm.containsKey(s)) {
				hm.put(s, hm.get(s)+1);
			}
			else {
				hm.put(s, 1);
			}
		}
		
		//Set<Entry<String, Integer>> set = hm.entrySet();
	
		ArrayList<String> l= new ArrayList<>();
		
		ArrayList<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(hm.entrySet());
        Collections.sort(list , new Comparator<Map.Entry<String, Integer>>()
        {
            public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
            {
                return (o2.getValue()).compareTo( o1.getValue() );
            }
        } );
        for(Map.Entry<String, Integer> entry:list){
        	
        	l.add(entry.getKey());
        }
		return l ;
		
		
	}

	public static void main(String[] args) {
		
		ArrayList<String> al= new ArrayList<>();
		ArrayList<String> l= new ArrayList<>();
		al.add("z");
		al.add("z");
		al.add("b");
		al.add("h");
		al.add("a");
		al.add("a");
		al.add("g");
		al.add("g");
		al.add("g");
		
		SetImplementation set= new SetImplementation();
		System.out.println(set.sortedURL(al).size());
		System.out.println(set.sortedURL(al));
		
		
		
		
	}

}
