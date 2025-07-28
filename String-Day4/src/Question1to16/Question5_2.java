package Question1to16;

import java.util.Scanner;

/*Description:Get the address from the user and verify "pincode" is
present or not?
Example:
------------
Input = 5-35-2a,ramsarath,chennai
Output = invalid address*/
public class Question5_2 {
	public static void main(String[] args) {
		
		System.out.println("Enter the Address to verify");
		Scanner scan=new Scanner(System.in);
		String input=scan.nextLine();
		
		if(input.toLowerCase().contains("pincode")) {
			System.out.println("Pincode Present, Valid Address");
		}else {
			System.out.println("Invalid Address, Pincode missing");
		}
	}
}
