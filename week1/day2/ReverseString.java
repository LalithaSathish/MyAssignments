package week1.day2;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String input=scr.nextLine();
		StringBuilder output=new StringBuilder(input);
		
		System.out.println("Reverse(): "+output.reverse());
		
		System.out.println("Reversed String: ");
		for(int i=0;i<input.length();i++)
		{
			if(input=="null")
			{
			  System.out.println("Invalid Input");
			}
			else
			{
				int temp;
				temp=input.length()-(i+1);
			System.out.print(input.charAt(temp));
			
			}
		}
	}

}
