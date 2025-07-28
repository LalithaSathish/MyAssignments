package String_Exercise;

import java.util.Map;
import java.util.Map.Entry;
import java.util.LinkedHashMap;

public class FirstNonRepeatedCharacter_String {
	
public static void main(String[] args) {
	    
		String str="lalitha selvaraj";
		char[] array=str.toCharArray();
		
		Map <Character,Integer> map=new LinkedHashMap<>();
		
		for(char ch:array){
		    if(map.containsKey(ch)){
		        map.put(ch,map.get(ch)+1);
		    }else{
		        map.put(ch,1);
		    }
		}
		
		for(Entry<Character,Integer>entry:map.entrySet()){
		  if(entry.getValue()==1){
		      System.out.println("First non-repeated character in "+str+" is "+entry.getKey());
		      break;
		  }
		}
		
	}
}
