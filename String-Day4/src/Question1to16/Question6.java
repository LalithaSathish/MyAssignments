
package Question1to16;

import java.util.Scanner;

/*Description:Get the phonenumber from the user .
If phonenumber exceeds greater than 10 then return invalid
number

Example:
--------
Input = 76394162677
output = invalid
Example 2:
---------
Input = 7639416267
Output = valid*/

public class Question6 {

	public static String isValidPhonenumberdigit(String in) {
		System.out.print("Length of the phone number is "+in.length()+",");
		if(in.length()==10)
		{
			return "valid Phone Number";
		}else {
			return "invalid Phone Number";
		}

	}

	public static void main(String[] args) {

		System.out.println("Enter Phone number to verify");
		Scanner scan=new Scanner(System.in);
		String input=scan.next();

		System.out.print(isValidPhonenumberdigit(input));

	}

}
