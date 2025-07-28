package Question1to16;

import java.util.Scanner;

/*Description:Get the input from the user and print that word in lowercase
Example:
--------
Input = RAMSARATH
Output = ramsarath*/
public class Question8_1 {
	public static void main(String[] args) {
		
		System.out.println("Enter the input: ");
		Scanner scan=new Scanner(System.in);
		String input=scan.nextLine();
		
		System.out.println(input.toLowerCase());
		
	}

}
