package day2;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the sting to reverse: ");
		String in = input.nextLine();
		
		char inputt[]=in.toCharArray();
		System.out.println("Reversed string: ");
		for (int i = inputt.length-1; i >= 0; i--) {
			System.out.print(inputt[i]);
		}

	}

}
