package String_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the two input strings ");
		String str1=scan.next();
		String str2=scan.next();
		
		char[] in1=str1.toCharArray();
		char[] in2=str2.toCharArray();
		
		Arrays.sort(in1);
		Arrays.sort(in2);
		
		if(Arrays.equals(in1, in2)) {
			System.out.println("Given Strings are Anagrams");
		}else {
			System.out.println("Given StringAnagrams");
		}
	}

}
