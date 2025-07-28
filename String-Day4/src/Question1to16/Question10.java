package Question1to16;

import java.util.Scanner;

/*Description : Get two input from user and Compare
Example
---------
String 1 : ramsarath
String 2 : Ramsarath
Example
---------
String 1 : ram
String 2 : Ramsarath*/
public class Question10 {

	public static void main(String[] args) {

		System.out.println("Enter two Strings to compare: ");	
		Scanner scan=new Scanner(System.in);
		String input1=scan.next();
		String input2=scan.next();

		System.out.println(input1.equals(input2));
	}
}
