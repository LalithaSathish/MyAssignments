package Question1to16;

import java.util.Scanner;

/*Description: Get the email from the user and verify "gmail" is present or
not.
If present replace that gmail into yahoo
Example:
------------
Input = ramsarath24@gmail.com
Output = ramsarath24@yahoo.com*/
public class Question7_4 {
	public static void main(String[] args) {
		
		System.out.println("Enter Email Id");
		Scanner scan=new Scanner(System.in);
		String input=scan.next();
		
		if (input.contains("gmail")) {
			System.out.println("Email replaced "+input.replace("gmail", "yahoo"));
		}else {
			System.out.println("email not contains gmail");
		}
	}

}
