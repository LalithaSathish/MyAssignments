package javaDataBaseConnection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class dummy {
	
	public static void main(String[] args) {
		
		Map<String,Integer> map=new HashMap();
		
		map.put("Chicken", 350);
		map.put("Mutton", 700);
		map.put("Fish", 200);
		map.put("Egg", 100);
		map.put("Prawn", 500);
		
		map.replace("Prawn", 300);
		
	    for (Entry<String,Integer> a:map.entrySet()) {
	    	
			System.out.print(a.getKey());
			System.out.println("\t"+a.getValue());
		}
	}

}
