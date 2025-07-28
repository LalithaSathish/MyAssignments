package Question1to16;
/*Description:Get the input from the user and print that word in Uppercase

Example:
--------
Input = ramsarath
Output = RAMSARATH*/

import java.util.Scanner;

public class Question8_2 {
	public static void main(String[] args) {
		System.out.println("Enter the input: ");
		Scanner scan=new Scanner(System.in);
		String input=scan.nextLine();
		
		System.out.println(input.toUpperCase());
	}

}
