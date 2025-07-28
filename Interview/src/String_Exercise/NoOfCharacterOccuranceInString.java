package String_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class NoOfCharacterOccuranceInString {
	
	public static void main(String[] args) {
		 
		String str="Lalitha Selvaraj";
		
		char[] input=str.toLowerCase().toCharArray();
		
		Map<Character, Integer> output=new LinkedHashMap();
		
		for(char s:input) {
			if(output.containsKey(s)) {
				output.put(s, output.get(s)+1);
			}else {
				output.put(s, 1);
			}
		}
		
		for(Entry<Character,Integer> entry:output.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}

}
