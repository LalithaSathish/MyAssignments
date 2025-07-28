package String_Exercise;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		
		String str="automation";
		char[] array=str.toLowerCase().toCharArray();
		
		Set s=new LinkedHashSet();
		
		for (char c : array) {
			if(s.add(c)) {
				System.out.print(c);
			}
		}
		
	}

}
