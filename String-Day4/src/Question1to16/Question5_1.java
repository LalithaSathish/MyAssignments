package Question1to16;

import java.util.Scanner;

/* Description: Get the email id from the user and verify '@' is present or
not?

Example:
------------
Input = ramsarath451@gmail.com
Output = valid email id */

public class Question5_1 {
	
	public static void main(String[] args) {
		System.out.println("Enter the Email ID for validation: ");
		Scanner scan=new Scanner(System.in);
		String input=scan.next();
		
		if(input.contains("@")) {
			System.out.println("Valid Email ID");
		}else {
			System.out.println("Invalid Email ID");
		}
		
	}

}
