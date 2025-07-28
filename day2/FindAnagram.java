package day2;

import java.util.Arrays;
import java.util.Scanner;

public class FindAnagram {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the input 1: ");
		String name1=input.nextLine();
		
		Scanner input1=new Scanner(System.in);
		System.out.println("Enter the input 2: ");
		String name2=input1.nextLine();

		char[] in1=name1.toLowerCase().toCharArray();
		char[] in2=name2.toLowerCase().toCharArray();
		
		Arrays.sort(in1);
		Arrays.sort(in2);

		if (Arrays.equals(in1, in2)) {
			System.out.println("This is anagram");
		}else {
			System.out.println("Not Anagram");
		}


	}

}
