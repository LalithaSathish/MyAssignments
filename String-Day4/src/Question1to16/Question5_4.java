package Question1to16;

import java.util.Scanner;

/*Description:Get the phonenumber from the user and verify any character
is present or not .
If character is present return invalid number

Example:
------------
Input = 763a941g6267
Output = False*/

public class Question5_4 {

	public static String isDigit(String in) {

		if(in.matches("\\d+"))
		{
			return "Valid Phonenumber";
		}
		else {
			return "Invalid Phonenumber";
		}
	}

	public static void main(String[] args) {

		System.out.println("Enter phone number to verify");
		Scanner scan=new Scanner(System.in);
		String input=scan.next();
		
		System.out.println(isDigit(input));

	}

}
