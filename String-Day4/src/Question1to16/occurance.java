package Question1to16;

import java.util.LinkedHashSet;
import java.util.Set;

public class occurance {
	
	public static void main(String[] args) {
		
		
		String str="Llllllaaaaliiiithhhhhhhhhhhaaaaaaaa";
		
		String input=str.toLowerCase();
		
		char array[]=input.toCharArray();
		int temp=0;
		
		for (int i = 0; i < array.length-1; i++) {
			for (int j = i+1; j < array.length-2; j++) {
				if (array[i]==array[j]) {
					temp=temp+1;
				}
			}
			System.out.println(array[i]+" "+temp);
			temp=0;
		}
		
		
	}

}
