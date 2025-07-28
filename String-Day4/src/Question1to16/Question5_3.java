package Question1to16;
/*Description:Get the email from the user and verify '@' is present or not
and return true or false?
Example:
------------
Input = xavier24@gmail.com
Output = True/False*/

import java.util.Scanner;

public class Question5_3 {
	public static void main(String[] args) {

		System.out.println("Enter the Email ID for validation: ");
		Scanner scan=new Scanner(System.in);
		String input=scan.next();

		System.out.println(input.contains("@"));
	}

}
