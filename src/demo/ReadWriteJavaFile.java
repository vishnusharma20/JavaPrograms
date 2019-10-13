package demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ReadWriteJavaFile {

	public static void main(String[] args) throws IOException {
		
		//Read a text file
		FileReader file1= new FileReader("C:\\Users\\mmt7667\\Desktop\\read.txt");
		BufferedReader bf = new BufferedReader(file1);
		
		String word;
		
		Map<String , Integer> map= new HashMap<>();
		int count=0;
		while((word = bf.readLine()) != null)
		{
			if(map.containsKey(word)) {
			count=map.get(word);
			map.put(word, count+1);
			count++;
			}
			else {
				map.put(word, 1);
			}
		}
		Set<Entry<String, Integer>> set = map.entrySet();
		ArrayList<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
        Collections.sort( list, new Comparator<Map.Entry<String, Integer>>()
        {
            public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
            {
                return (o2.getValue()).compareTo( o1.getValue() );
            }
        } );
        for(Map.Entry<String, Integer> entry:list){
            System.out.println(entry.getKey()+" ==== "+entry.getValue());
        }
		 
	//Write into a text file
		/*FileWriter writer= new FileWriter("C:\\Users\\mmt7667\\Desktop\\read.txt");
		BufferedWriter bf1 = new BufferedWriter(writer);
		
		if(bf.readLine()==null)
		{	
		
		bf1.write("Hello! welcome writing");
		bf1.newLine();
		bf1.write("bbye");
		}*/
		//bf1.close();
	
		
		
		

	}

}
